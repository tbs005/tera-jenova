package com.angelis.tera.game.process.services;

import org.apache.log4j.Logger;

import com.angelis.tera.common.process.services.BaseI18nService;

public final class I18nService extends BaseI18nService {
    
    /** LOGGER */
    private static Logger log = Logger.getLogger(BaseI18nService.class.getName());
    
    @Override
    public void onInit() {
        log.info("I18nService started");
    }

    @Override
    public void onDestroy() {
        log.info("I18nService stopped");
    }
    
    @Override
    public String getBundleName() {
        return "com.angelis.tera.game.presentation.i18n.messages";
    }
    
    /** SINGLETON */
    public static I18nService getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        protected static final I18nService instance = new I18nService();
    }
}
