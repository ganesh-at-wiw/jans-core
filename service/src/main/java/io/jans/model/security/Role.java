/*
 * Janssen Project software is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2020, Janssen Project
 */

package io.jans.model.security;

/**
 * Represents a user role. A conditional role is a special type of role that is
 * assigned to a user based on the contextual state of a permission check.
 */
public class Role extends SimplePrincipal {
    private boolean conditional;

    public Role(String name) {
        super(name);
    }

    public Role(String name, boolean conditional) {
        this(name);
        this.conditional = conditional;
    }

    public boolean isConditional() {
        return conditional;
    }
}
