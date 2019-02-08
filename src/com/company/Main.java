package com.company;

public class Main
    {
        
        public static void main(String[] args)
            {
                
                final int STARTING_POSITION = 1;
                final int WINNING_POSITION = 10;
                final int SIDES_OF_DICE = 6;
                
                //int dieRoll = random.nextInt(SIDES_OF_DICE) + 1;
                java.util.Random random = new java.util.Random();
                int playerOnePosition = STARTING_POSITION;
                int playerTwoPosition = STARTING_POSITION;
                boolean playerOneTurn = true;
                
                do
                {
                    int dieRoll = random.nextInt(SIDES_OF_DICE) + 1;
                    int dieRoll2 = random.nextInt(SIDES_OF_DICE) + 1;
                    int dieTotal = dieRoll + dieRoll2;
                    //----------------------------------------------
                    
                    if (playerOneTurn)
                    {
                        int nextPosition = playerOnePosition + 1;
                        
                        System.out.println("Dice One: " + dieRoll + "   Dice Two: " + dieRoll2 + "    Dice Total: " + dieTotal);
                        
                        boolean moveForward = (dieRoll == nextPosition || dieRoll2 == nextPosition || dieTotal == nextPosition);
                        if (moveForward)
                        {
                            playerOnePosition = playerOnePosition + 1;
                        }
                    }
                    else
                    {
                        int nextPosition = playerTwoPosition + 1;
                        
                        System.out.println("Dice One: " + dieRoll + "   Dice Two: " + dieRoll2 + "    Dice Total: " + dieTotal);
                        
                        boolean moveForward = (dieRoll == nextPosition || dieRoll2 == nextPosition || dieTotal == nextPosition);
                        if (moveForward)
                        {
                            playerTwoPosition = playerTwoPosition + 1;
                        }
                    }
                    
                    
                    //----------------------------------------------------------------
                    System.out.println("Player one at position: " + playerOnePosition);
                    System.out.println("Player two at position: " + playerTwoPosition);
                    playerOneTurn = !playerOneTurn;
                }
                while (playerOnePosition < WINNING_POSITION && playerTwoPosition < WINNING_POSITION);
                
                if(playerOnePosition == WINNING_POSITION)
                {
                    System.out.println("Player one Wins!");
                }
                else
                {
                    System.out.println("Player two Wins!");
                }
            }
    }
