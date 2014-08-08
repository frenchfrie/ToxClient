/*
 * Copyright (C) 2014 henri
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

import im.tox.jtoxcore.FriendExistsException;
import im.tox.jtoxcore.ToxFriend;
import im.tox.jtoxcore.ToxUserStatus;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author henri
 */
public class FriendList implements im.tox.jtoxcore.FriendList<ToxFriend> {

    List<ToxFriend> friendsList = new ArrayList<>();

    @Override
    public ToxFriend getByFriendNumber(final int friendNumber) {
        return searchFriend(new SearchTest() {

            @Override
            public boolean isMatching(ToxFriend friend) {
                return friend.getFriendnumber() == friendNumber;
            }
        });
    }

    @Override
    public ToxFriend getById(final String id) {
        return searchFriend(new SearchTest() {

            @Override
            public boolean isMatching(ToxFriend friend) {
                return friend.getId().equals(id);
            }
        });
    }

    @Override
    public List<ToxFriend> getByName(final String name, final boolean ignorecase) {
        return searchFriends(new SearchTest() {

            @Override
            public boolean isMatching(ToxFriend friend) {
                return ignorecase ? friend.getName().equalsIgnoreCase(name) : friend.getName().equals(name);
            }
        });
    }

    @Override
    public List<ToxFriend> searchFriend(String partial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ToxFriend> getByStatus(ToxUserStatus status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ToxFriend> getOnlineFriends() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ToxFriend> getOfflineFriends() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ToxFriend> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ToxFriend addFriend(int friendnumber) throws FriendExistsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ToxFriend addFriendIfNotExists(int friendnumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeFriend(int friendnumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * It is going to be useful with lambda expressions.
     */
    private static interface SearchTest {

        boolean isMatching(ToxFriend friend1);

    }

    private ToxFriend searchFriend(SearchTest test) {
        ToxFriend friend = null;
        for (ToxFriend toxFriend : friendsList) {
            if (test.isMatching(toxFriend)) {
                friend = toxFriend;
            }
        }
        return friend;
    }

    private List<ToxFriend> searchFriends(SearchTest test) {
        List<ToxFriend> friends = new ArrayList<>();
        for (ToxFriend toxFriend : friendsList) {
            if (test.isMatching(toxFriend)) {
                friends.add(toxFriend);
            }
        }
        return friends;
    }

}
