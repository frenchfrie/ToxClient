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

import org.frenchfrie.toxclient.ui.MainGui;
import im.tox.jtoxcore.JTox;
import im.tox.jtoxcore.ToxException;
import im.tox.jtoxcore.callbacks.CallbackHandler;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 * Main class, built using the API desciption
 * https://libtoxcore.so/getting_started_in_c.html. This API is usable for the
 * Java wrapper because it is a very thin wrapper.
 *
 * @author frenchfrie
 */
public class ToxClient {

    private MainGui gui;

    private JTox tox;

    private ScheduledThreadPoolExecutor executor;

    public ToxClient() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {

                @Override
                public void run() {
                    gui = new MainGui();
                    gui.pack();
                    gui.setLocationRelativeTo(null);
                    gui.setVisible(true);
                }
            });
        } catch (InterruptedException | InvocationTargetException ex) {
            Logger.getLogger(ToxClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        ToxFriendList fl = new ToxFriendList();
        CallbackHandler callbackHandler = new CallbackHandler(fl);
        try {
            tox = new JTox(fl, callbackHandler);
            tox.setName("frenchfrie");
            String address = tox.getAddress();
            System.out.println("adress = " + address);

            executor = new ScheduledThreadPoolExecutor(1);
            executor.scheduleAtFixedRate(new ToxThread(tox), 50, 50, TimeUnit.MILLISECONDS);

        } catch (ToxException ex) {
            Logger.getLogger(ToxClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("path = " + System.getProperty("java.library.path"));
        new ToxClient();
    }

    private static class ToxThread implements Runnable {

        private JTox tox;

        public ToxThread(JTox tox) {
            this.tox = tox;
        }

        @Override
        public void run() {
            try {
                tox.doTox();
            } catch (ToxException ex) {
                Logger.getLogger(ToxClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
