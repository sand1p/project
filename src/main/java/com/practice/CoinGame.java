package com.practice;

import com.practice.input.InputParser;

import java.util.List;

public class CoinGame {
    private final InputParser inputParser;
    private final List<Player> players;
    private final Chooser chooser;

    public CoinGame( InputParser inputParser, List<Player> players, Chooser chooser ) {
        this.inputParser = inputParser;
        this.players = players;
        this.chooser = chooser;
    }

    public void addPlayer() {
        final String playName = inputParser.getPlayName( "Enter player name " );
        players.add( new Player( playName ) );
    }

    public Player choosePlayer() {
        return (Player) chooser.choose(players);
    }


}
