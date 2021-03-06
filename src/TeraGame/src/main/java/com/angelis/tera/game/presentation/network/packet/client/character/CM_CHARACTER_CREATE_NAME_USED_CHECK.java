package com.angelis.tera.game.presentation.network.packet.client.character;

import java.nio.ByteBuffer;

import com.angelis.tera.game.presentation.network.connection.TeraGameConnection;
import com.angelis.tera.game.presentation.network.packet.TeraClientPacket;
import com.angelis.tera.game.process.services.PlayerService;

public class CM_CHARACTER_CREATE_NAME_USED_CHECK extends TeraClientPacket {

    private short type;
    private String name;
    
    public CM_CHARACTER_CREATE_NAME_USED_CHECK(final ByteBuffer byteBuffer, final TeraGameConnection connection) {
        super(byteBuffer, connection);
    }

    @Override
    protected void readImpl() {
        this.type = readH();
        this.name = readS();
    }

    @Override
    protected void runImpl() {
        PlayerService.getInstance().onPlayerCheckNameUsed(this.getConnection(), type, name);
    }
}
