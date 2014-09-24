/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2d_minecraft_game;

import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
/**
 *
 * @author SAlam
 */
public class Tile
{   
    public static int tileSize = 20;
    
    public static int[] air = {-1, -1};
    public static int[] earth = {0, 0};
    
    public static int[] character = {0, 18};
    
    public static BufferedImage tileset_terrain;
    
    public Tile()
    {
        try
        {
            Tile.tileset_terrain = ImageIO.read(new File("res/tileset_terrain.png"));
        }
        catch(Exception e)
        {
            
        }       

                
           
    }
}
