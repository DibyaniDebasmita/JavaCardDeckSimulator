# JavaCardDeckSimulator

## Project Overview

This project is a *Java Card Deck Simulator* that simulates a standard 52-card deck. The program allows for various functionalities, including drawing random cards and sorting them based on custom rules.

## Features

Card Representation: Uses Enums for the four suits (Spade, Club, Heart, Diamond) and ranks (Ace, 2-10, Jack, Queen, King).
Deck Management: A Deck class to manage the 52 cards, with methods for drawing cards, checking deck size, and optional shuffling.
Random Card Drawing: Draw 20 random cards from the deck and store them in an ArrayList.
Custom Sorting: Implement a Comparator to sort cards based on: color, suit and rank using custom comparator.
Unit Testing: Unit tests are written to validate the functionality of the simulator.

## Requirements

1.Java JDK 8 or higher
2.Maven or any preferred Java IDE (Eclipse, IntelliJ, etc.)

## Project Structure

The project consists of the following classes:
Card.java: Represents a single card with Suit and Rank enums.
Deck.java: Manages the deck of 52 cards, with methods for shuffling, drawing cards and checking deck size.
CardComparator.java: Compares cards based on color, suit and card value.
Main.java: Demonstrates the usage of the deck and card drawing.
DeckTest.java: Unit tests to ensure the code functions as expected.

## Usage

To run this project, simply execute the "Main" class. This will create a deck, suffle it, draw 20 random cards, sort them and print them to the console.

## Testing

This project include unit test in the 'DeckTest' class to ensure the code function as expected.

## Author

Dibyani Debasmita Behera
