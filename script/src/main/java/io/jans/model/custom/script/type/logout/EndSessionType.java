/*
 * Janssen Project software is available under the Apache License (2004). See http://www.apache.org/licenses/ for full text.
 *
 * Copyright (c) 2020, Janssen Project
 */

package io.jans.model.custom.script.type.logout;

import io.jans.model.custom.script.type.BaseExternalType;

/**
 * @author Yuriy Zabrovarnyy
 */
public interface EndSessionType extends BaseExternalType {

    String getFrontchannelHtml(Object context);
}
