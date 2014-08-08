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
package org.frenchfrie.toxclient.model;

import im.tox.jtoxcore.FriendList;
import im.tox.jtoxcore.JTox;
import im.tox.jtoxcore.ToxException;

/**
 * Representation of current user. Calls are forwarded to the JTox instance.
 * <p>
 * This class aim is to explode Tox API and to store possible user properties.
 * </p>
 *
 * @author frenchfrie
 */
public class User {

    JTox tox;

    public User(JTox tox) {
        this.tox = tox;
    }

    public String getName() throws ToxException {
        return tox.getSelfName();
    }
    
    public void setName(String name) throws ToxException{
        tox.setName(name);
    }

    public String getAddress() throws ToxException {
        return tox.getAddress();
    }
    
    public FriendList getFriendList() {
        return tox.getFriendList();
    }

    public int getNospam() throws ToxException {
        return tox.getNospam();
    }

}
