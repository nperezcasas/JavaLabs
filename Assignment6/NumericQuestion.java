  
/**
 * COMS 104
 * Nuria Perez Casas
 * Assignment #6 - P9.1
 * 
 * Checks if a numeric question is within the error bounds. And it is an 
 * extension of the Question class. 
 */

public class NumericQuestion extends Question 
{
    private double answer;

    /**
     * Overrides the setAnswer method from the question super class. 
     * Sets the answer for the numeric question
     * @param correctResponse
     */
    public void setAnswer(double correctResponse) 
    {
        answer = correctResponse;
    }

    /**
     * Overrides the checkAnswer method from the question super class.
     * Checks a given response for correctness, checks if the answer is
     * within the bounds. 
     * @param response
     * @return true if response is within the bounds, false otherwise
     */
    public boolean checkAnswer(String response) 
    {
        double responseNumeric = Double.parseDouble(response);
        return Math.abs(responseNumeric - answer) <= 0.01;
    }
}