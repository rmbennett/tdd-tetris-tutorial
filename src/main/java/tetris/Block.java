// Copyright (c) 2008-2014  Esko Luontola <www.orfjackal.net>
// You may use and modify this source code freely for personal non-commercial use.
// This source code may NOT be used as course material without prior written agreement.

package tetris;

/**
 * Created by rmb209 on 08/01/14.
 */
public class Block {

    private final char blocks;
    private final int row;
    private final int col;

    public Block(char block) {
        this.row = 0;
        this.col = 0;
        this.blocks = block;

    }

    public Block(int row, int col,char block) {
        this.row = row;
        this.col = col;
        this.blocks = block;

    }
    public Block moveTo(int row, int col){
        return new Block(row, col, blocks);
    }
}

