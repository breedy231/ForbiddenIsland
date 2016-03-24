import java.util.ArrayList;
import tester.*;
import javalib.impworld.*;
import javalib.worldimages.*;
import java.awt.Color;

// a generic interface for the empty list
interface IList<T> {
    
}

// a class for a generic empty list
class MtList<T> {
    
}

// a class for a generic list
class ConsList<T> {
    T first;
    IList<T> rest;
    ConsList(T first, IList<T> rest) {
        this.first = first;
        this.rest = rest;
    }
}

//Represents a single square of the game area
class Cell {
    // represents absolute height of this cell, in feet
    double height;
    // In logical coordinates, with the origin at the top-left corner of the scren
    int x, y;
    // the four adjacent cells to this one
    Cell left, top, right, bottom;
    // reports whether this cell is flooded or not
    boolean isFlooded;
}

class OceanCell extends Cell {
}

class ForbiddenIslandWorld extends World {
    // All the cells of the game, including the ocean
    IList<Cell> board;
    // the current height of the ocean
    int waterHeight;
    // Defines an int constant
    static final int ISLAND_SIZE = 64;
}
