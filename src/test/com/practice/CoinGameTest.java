package com.practice;

import com.practice.input.InputParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CoinGameTest {
    @Mock
    private InputParser inputParser;
    @Mock
    private List<Player> players;
    @Mock
    private Chooser<Player> chooser;

    @Test
    public void shouldAddPlayerInPlayerList() {
        when( inputParser.getPlayName( any() ) )
                .thenReturn( "Player A" )
                .thenReturn( "Player B" );

        final CoinGame coinGame = new CoinGame( inputParser, players, chooser );
        coinGame.addPlayer();
        coinGame.addPlayer();

        verify( players, times( 2 ) ).add( any() );
    }

    @Test
    public void shouldReturnSelectedPlayerFromListOfPlayers() {
        Player player1 = mock( Player.class );
        Player player2 = mock( Player.class );
        List<Player> players = Arrays.asList( player1, player2 );
        when( chooser.choose(any()) ).thenReturn( player1 );

        final CoinGame coinGame = new CoinGame( inputParser, players, chooser );

        Player player = coinGame.choosePlayer();

        Assert.assertEquals( player1 , player );
    }
}