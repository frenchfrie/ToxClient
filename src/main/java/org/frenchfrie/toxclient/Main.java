package org.frenchfrie.toxclient;

import im.tox.jtoxcore.JTox;
import im.tox.jtoxcore.ToxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.loadLibrary("natives/libjtoxcore.so");
            JTox tox = new JTox(null, null);
        } catch (ToxException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
