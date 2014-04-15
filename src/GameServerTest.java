
/**
 * Copyright 2014 A-Team Games
 *
 * This file is part of ateam-tanks.
 *
 *    ateam-tanks is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    ateam-tanks is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with ateam-tanks.  If not, see <http://www.gnu.org/licenses/>.
 */


public class GameServerTest
{

    public static void main ( String args[] )
    {
        SpriteList init = new SpriteList();
        init.add(new SimpleTank(new Vector3D(-150, 20, 10), new Direction(0, 0), 1, 1));
        init.add(new SimpleTank(new Vector3D(-150, -20, 10), new Direction(0, 0), 1, 2));

        init.add(new SimpleTank(new Vector3D(150, 20, 10), new Direction(0, 0), 2, 1));
        init.add(new SimpleTank(new Vector3D(150, -20, 10), new Direction(0, 0), 2, 2));

        init.add(new SimpleTank(new Vector3D(20, -150, 10), new Direction(0, 0), 3, 1));
        init.add(new SimpleTank(new Vector3D(-20, -150, 10), new Direction(0, 0), 3, 2));

        init.add(new SimpleTank(new Vector3D(20, 150, 10), new Direction(0, 0), 4, 1));
        init.add(new SimpleTank(new Vector3D(-20, 150, 10), new Direction(0, 0), 4, 2));

        init.add(new Obstacle(new Vector3D(0, 0, 0), new Direction(0, 0), 27));

        init.add(new Obstacle(new Vector3D(120, 120, 0), new Direction(0, 0), 17));
        init.add(new Obstacle(new Vector3D(120, -120, 0), new Direction(0, 0), 17));
        init.add(new Obstacle(new Vector3D(-120, 120, 0), new Direction(0, 0), 17));
        init.add(new Obstacle(new Vector3D(-120, -120, 0), new Direction(0, 0), 17));

        init.add(new Obstacle(new Vector3D(-88, 40, 0), new Direction(0, 0), 15));
        init.add(new Obstacle(new Vector3D(-88, -40, 0), new Direction(0, 0), 15));
        init.add(new Obstacle(new Vector3D(88, 40, 0), new Direction(0, 0), 15));
        init.add(new Obstacle(new Vector3D(88, -40, 0), new Direction(0, 0), 15));
        init.add(new Obstacle(new Vector3D(40, 88, 0), new Direction(0, 0), 15));
        init.add(new Obstacle(new Vector3D(-40, 88, 0), new Direction(0, 0), 15));
        init.add(new Obstacle(new Vector3D(40, -88, 0), new Direction(0, 0), 15));
        init.add(new Obstacle(new Vector3D(-40, -88, 0), new Direction(0, 0), 15));

        GameServer s = new GameServer (2, 2, init);
        s . start ();
    }

}
