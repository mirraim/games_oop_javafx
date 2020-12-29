package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;


public class BishopBlackTest {

    @Test
    public void positionTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        assertThat(bishopBlack.position(), is(Cell.A3));
    }

    @Test
    public void copyTest() {
        BishopBlack firstBishop = new BishopBlack(Cell.A3);
        Figure secondBishop = firstBishop.copy(Cell.D6);
        assertThat(secondBishop.position(), is(Cell.D6));
    }

    @Test
    public void wayTest() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.G5), is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void ifWrongWay() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
       bishopBlack.way(Cell.G2);
    }

}