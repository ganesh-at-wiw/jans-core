package org.gluu.model.custom.script.type.logout;

import org.gluu.model.SimpleCustomProperty;

import java.util.Map;

/**
 * @author Yuriy Zabrovarnyy
 */
public class DummyEndSessionType implements EndSessionType {
    @Override
    public boolean init(Map<String, SimpleCustomProperty> configurationAttributes) {
        return true;
    }

    @Override
    public boolean destroy(Map<String, SimpleCustomProperty> configurationAttributes) {
        return true;
    }

    @Override
    public int getApiVersion() {
        return 1;
    }

    @Override
    public String getFrontchannelHtml(Object context) {
        return null;
    }

    @Override
    public String getFrontchannelPage(Object context) {
        return null;
    }
}