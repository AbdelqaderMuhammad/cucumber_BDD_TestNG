# tage can work before features or scenario or scenario outline or examples only.

Feature: hello world with cucumber in java

  @hello_world @Any_word
  Scenario: just say hello world.
    Given hello world

  @Any_word
  Scenario: just say any world
    Given I want to say blah.

  @certain_word @Any_word
  Scenario: say a word.
    Given say "abdelqader"

  @With_examples @Any_word
  Scenario Outline: say multiple words
    Given say multiple "<names>" using examples
    @other_names
    Examples:
    | names      |
    | Ahmed      |
    | muhammad   |
    @only_me
    Examples:
    | names      |
    | Abdelqader |
    | muhammad   |

  @multi-words
  Scenario: say a multiple words.
    Given say text in three dots
    """
    This is the text which should be passed to the method
    """

