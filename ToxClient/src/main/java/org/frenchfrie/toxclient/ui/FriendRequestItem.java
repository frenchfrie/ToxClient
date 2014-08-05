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

/**
 *
 * @author frenchfrie
 */
public class FriendRequestItem extends javax.swing.JPanel {

    /**
     * Creates new form FriendRequestItem
     */
    public FriendRequestItem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFriendName = new javax.swing.JLabel();
        jButtonAccept = new javax.swing.JButton();
        jButtonIgnore = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jLabelFriendName.setText("friend name");
        jLabelFriendName.setMaximumSize(new java.awt.Dimension(3000, 15));
        add(jLabelFriendName);

        jButtonAccept.setText("Accept");
        add(jButtonAccept);

        jButtonIgnore.setText("Ignore");
        add(jButtonIgnore);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccept;
    private javax.swing.JButton jButtonIgnore;
    private javax.swing.JLabel jLabelFriendName;
    // End of variables declaration//GEN-END:variables
}
