/*
 * Copyright (C) 2014 frenchfrie
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.frenchfrie.toxclient.ui;

import im.tox.jtoxcore.ToxUserStatus;

/**
 * Default implementation for {@link IViewFriend} for test purposes.
 *
 * @author frenchfrie
 */
public class DefaultViewFriend implements IViewFriend {

    private String name;
    
    private ToxUserStatus status = ToxUserStatus.TOX_USERSTATUS_NONE;

    public DefaultViewFriend() {
    }

    
    public DefaultViewFriend(String name) {
        this.name = name;
    }
    
    @Override
    public void removeFriend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ToxUserStatus getStatus() {
        return status;
    }

}
