UseCase1- Given a Message, ability to analyse and respond Happy or Sad Mood - Create MoodAnalyser Object - Call analyseMood function with message as parameter and return Happy or Sad Mood.

Test Case1.1-Given I am in Sad Mood message Should Return SAD

Test Case1.2-Given I am in Any Mood message Should Return HAPPY

Refactor the code to take the mood message in Constructor MoodAnalyser will have a message Field MoodAnalyser will have 2 Constructors MoodAnalyser() and with Parameters MoodAnalyser(message) analyseMood method will change to support no parameters and use message Field defined for the Class

UseCase 2-Handle Exception if User Provides Invalid Mood

TestCase 2.1-Given Null Mood Should Return Happy

UseCase 3-Inform user if entered Invalid Mood In case of NULL or Empty Mood throw Custom Exception MoodAnalysisException Use Enum to differentiate the Mood Analysis Errors.

TestCase 3.1-Given NULL Mood Should Throw MoodAnalysisException

TestCase 4-Given NULL Mood Should Throw MoodAnalysisException Should Throw MoodAnalysisException indicating Empty Mood Handle Empty Mood Scenario throw MoodAnalysisException and inform user of the EmptyMood.