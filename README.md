SE319_Regex4Regex
=================

Playing with the idea of writing a language to replace writing RegEx (i.e. SQL-like commands to generate RegEx for you). Software Engineering 319 project.

#Constants: 
**Defined by:** 
  All Capital Letters

**Examples:**
ANYTHING, START, END

#operators
**Defined by:**
  Lower case words
  
**Examples:**
  and, or, not, then
  
#Characters
**Defined by:** Single quotes
**Examples:** 'a', 'x', 'z'

#Strings
**Defined by:** Quotation marks
**Examples:** "one", "dog", "qwerty"

#Examples

`'i' then ANYTHING then "xyz"`, will pass in the instance of 'iABCxyz'
