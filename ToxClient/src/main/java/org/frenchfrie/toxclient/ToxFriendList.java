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

package org.frenchfrie.toxclient;

import im.tox.jtoxcore.FriendExistsException;
import im.tox.jtoxcore.FriendList;
import im.tox.jtoxcore.ToxFriend;
import im.tox.jtoxcore.ToxUserStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author hmdebenque
 */
public class ToxFriendList implements FriendList {

    List<ToxFriend> friendList = new ArrayList<>();

    @Override
    public ToxFriend getByFriendNumber(int friendnumber) {
        for (ToxFriend toxFriend : friendList) {
            if (toxFriend.getFriendnumber() == friendnumber) {
                return toxFriend;
            }
        }
        return null;
    }

    @Override
    public ToxFriend getById(String id) {
        for (ToxFriend toxFriend : friendList) {
            if (toxFriend.getId().equals(id)) {
                return toxFriend;
            }
        }
        return null;
    }

    @Override
    public List getByName(String name, boolean ignorecase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List searchFriend(String partial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getByStatus(ToxUserStatus status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getOnlineFriends() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getOfflineFriends() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ToxFriend> all() {
        return Collections.unmodifiableList(friendList);
    }

    @Override
    public ToxFriend addFriend(int friendNumber) throws FriendExistsException {
        ToxFriend byFriendNumber = getByFriendNumber(friendNumber);
        if (byFriendNumber != null) {
            ToxFriend friend = new Friend();
            friendList.add(friend);
            return friend;
        }
        throw new FriendExistsException(friendNumber);
    }

    @Override
    public ToxFriend addFriendIfNotExists(int friendnumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeFriend(int friendnumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
