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

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;

/**
 *
 * @author frenchfrie
 */
public class WaitIcon implements Icon {

    private static final int ICON_WIDTH = 48;
    private static final int ICON_HEIGHT = 48;

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        
        g.drawChars(".".toCharArray(), 0, 0, x, y);
    }

    @Override
    public int getIconWidth() {
        return ICON_WIDTH;
    }

    @Override
    public int getIconHeight() {
        return ICON_HEIGHT;
    }

}
