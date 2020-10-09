/*
 * oxCore is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */
package io.jans.model.custom.script.type.user;

import java.util.Map;

import io.jans.model.SimpleCustomProperty;
import io.jans.model.custom.script.model.CustomScript;
import io.jans.model.custom.script.model.bind.BindCredentials;

/**
 * Dummy implementation of interface CacheRefreshType
 *
 * @author Yuriy Movchan Date: 12/30/2014
 */
public class DummyCacheRefreshType implements CacheRefreshType {

	@Override
	public boolean init(Map<String, SimpleCustomProperty> configurationAttributes) {
		return true;
	}
	@Override
    public boolean init(CustomScript customScript, Map<String, SimpleCustomProperty> configurationAttributes) {
        return true;
    }
	@Override
	public boolean destroy(Map<String, SimpleCustomProperty> configurationAttributes) {
		return true;
	}

	@Override
	public int getApiVersion() {
		return 2;
	}

	@Override
	public boolean updateUser(Object person, Map<String, SimpleCustomProperty> configurationAttributes) {
		return false;
	}

    @Override
    public BindCredentials getBindCredentials(String configId, Map<String, SimpleCustomProperty> configurationAttributes) {
        return null;
    }

	@Override
	public boolean isStartProcess(Map<String, SimpleCustomProperty> configurationAttributes) {
		return false;
	}

}