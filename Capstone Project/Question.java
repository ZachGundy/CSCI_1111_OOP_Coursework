/**
 * Author: Zach Gunderson
 * Date Created: 02/09/2023
 * Project Name: Question Class
 */
package JavaFX;

public class Question {

    private String question;

    private String answer;

    /** Constructor with String arg to return question
     *
     * @param question
     */
    public Question(String question) {
        this.question = question;
    }

    /** Get a question a Question title, the question, and question mark.
     *a
     * @return "return that question with the QUESTION header and ? tail.
     */
    public String getQuestion() {
        return "Question " + this.question + "?";

    }

    /**
     * Basic "Setter" designed to be able to set the desired question.
     * @param question
     * @return
     */
    //
    public String setQuestion(String question) {
        this.question = question;
        return question;
    }

    /**
     * get desired answer from question
     * @return
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Set a string answer for any give question.
     * @param answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}



