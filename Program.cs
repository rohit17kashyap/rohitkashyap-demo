using System;

class Question
{
    // Data members
    public string QuestionText;
    public string[] Options;
    public char CorrectAnswer;

    // Constructor
    public Question(string questionText, string[] options, char correctAnswer)
    {
        QuestionText = questionText;
        Options = options;
        CorrectAnswer = correctAnswer;
    }

    // Method to display question
    public void DisplayQuestion()
    {
        Console.WriteLine(QuestionText);

        char option = 'A';

        for (int i = 0; i < Options.Length; i++)
        {
            Console.WriteLine(option + ". " + Options[i]);
            option++;
        }
    }

    // Method to check answer
    public bool CheckAnswer(char answer)
    {
        return Char.ToUpper(answer) == Char.ToUpper(CorrectAnswer);
    }
}

class Program
{
    static void Main()
    {
        // Array of options
        string[] options = { "Java", "C#", "Python", "HTML" };

        // Object creation
        Question q1 = new Question(
            "Which language is used in .NET?",
            options,
            'B'
        );

        q1.DisplayQuestion();

        Console.Write("Enter Answer: ");
        char userAnswer = Convert.ToChar(Console.ReadLine() ?? "");

        if (q1.CheckAnswer(userAnswer))
        {
            Console.WriteLine("Correct Answer");
        }
        else
        {
            Console.WriteLine("Wrong Answer");
        }
    }
}