#------------------------------------------------------------------------------------
#------------------------------- MIS 373.24 -----------------------------------------
#------------------------------ Test 2 Review ---------------------------------------
#-------------------------- Professor: Joshua Rock ----------------------------------
#------------------------------------------------------------------------------------
#Linux Bash scripting (Putty)
#-----------------------------
#Variables

NAME="Jonathan";
echo $NAME;
echo "$NAME";
echo "${NAME}";
echo "My name is $NAME!";
echo 'My name is $NAME!'; #output for this line: My name is $NAME! because of '
echo ""


#------------------------------------------------------------------------------------
#Conditionals

#Conditions
# [[ -z STRING ]] empty string
# [[ -n STRING ]] not an empty string
# [[ STRING == STRING ]] equal
# [[ STRING != STRING ]] not equal
# [[ NUM -eq NUM ]] equal
# [[ NUM -ne NUM ]] not equal
# [[ NUM -lt NUM ]] less than
# [[ NUM -gt NUM ]] greater than
# [[ NUM -ge NUM ]] greater than or equal to
# [[ STRING =~ STRING ]] reqexp
# (( NUM < NUM )) numeric conditions
# [[ ! EXPR ]] not
# [[ X ]] && [[ Y ]] and
# [[ X ]] || [[ Y ]] or

#File conditions
# [[ -e FILE ]] exists
# [[ -r FILE ]] readable
# [[ -h FILE ]] symlink*
# [[ -d FILE ]] directory
# [[ -w FILE ]] writeable
# [[ -s FILE ]] size is > 0 bytes
# [[ -f FILE ]] file*
# [[ -x FILE ]] executable
# [[ FILE1 -nt FILE2 ]] 1 is more recent than 2*
# [[ FILE1 -ot FILE2 ]] 2 is more recent than 1*
# [[ FILE1 -ef FILE2 ]] same files

echo "----------------"
echo "Conditional example:"
if [[ -z '$NAME' ]]; then
        echo "Variable 'NAME' is empty"
elif [[ -n '$NAME' ]]; then
        echo "Variable 'NAME' is not empty"
fi
echo ""


#-------------------------------------------------------------------------------------
#Functions

#Defining functions

echo "Defining Function exmaple:"
myFunc() {
    echo "$1!"
}
#Alternative sytax for above function
#function myFunc () {
#    echo Inside myFunc!
#}

myFunc "Inside myFunc!"
echo ""
#$1 takes Inside myFunc! string

#Raising errors
echo "----------------"
echo "Raising Errors example:"
myFunc2() {
    return 1
}

if myFunc2; then
  echo "success"
else
  echo "failure"
fi
echo ""
#Returns: failure

#Return Values
echo "----------------"
echo "Return values example:"
myFunc3() {
  local myResult='value'
  echo "$myResult"
  echo "Inside myFunc3!"
}

echo "Outside of myFunc3"
result="$(myFunc3)"
echo $result
echo ""


#-------------------------------------------------------------------------
#Length && Manipulation

echo "----------------"
echo "Length example:"
#Length syntax: ${#NAME} where NAME is a variable (Jonathan)
echo "Variable 'NAME' is: $NAME"
echo "The length of variable 'NAME' is: ${#NAME}"
echo ""

echo "----------------"
echo "Manipulation example:"
vSTR="STRING!"
echo ${vSTR,}  #Makes first letter lowercase: sTRING
echo ${vSTR,,} #Makes entire string lowercase: string
echo "Upper to lower manipulation^"
echo ""

str="string!"
echo ${str^}   #Makes first letter uppercase: String!
echo ${str^^}  #Makes entire string uppercase: STRING!
echo "Lower to upper manipulation^"
echo ""


#--------------------------------------------------------------------------
#Loops

#Basic for loop
echo "----------------"
echo "Basic for Loop example:"
for i in '5'; do
  echo "Print"
done
echo ""

echo "----------------"
echo "C-like for Loop example:"
for ((i=0; i<5; i++)); do
  echo $i
done
echo "Times looped: $i"
echo ""

echo "----------------"
echo "Range examples"
echo ""
echo "Range: {1..5}"
for i in {1..5}; do
   echo "Welcome $i"
done
echo ""

echo "Range with step size: {5..50..5}"
for i in {5..50..5}; do
   echo "Welcome $i"
done
echo ""

echo "---------------"
echo "Reading lines example*:"
< file_01.sh | while read line; do
  echo $line
done
echo ""

#Infinite loop
#while true; do
#   ~insert code here~
#done


#---------------------------------------------------------------------------
#Arrays

echo "--------------"
echo "Defining Arrays example:"
Fruits=('Apple' 'Banana' 'Orange')

echo ${Fruits[0]}       #Element 0 (first element in array)
echo ${Fruits[@]}       #All elements, space-separated
echo ${#Fruits[@]}      #Number of elements
echo ${#Fruits}         #String length of the 1st element
echo ${#Fruits[3]}      #String length of the Nth element
#echo ${Fruits[@]:3:2}  #Range (from position 3, length 2)
echo ""

echo "--------------"
echo "Iterating Over an Array example:"
for i in "${Fruits[@]}"; do
   echo $i
done
echo ""


#-----------------------------------------------------------------
#Dictionaries

#Defining a Dictionary
echo "---------------"
echo "Defining a Dictionary example:"
declare -A sounds

sounds[dog]="bark"
sounds[cow]="moo"
sounds[bird]="tweet"
sounds[wolf]="howl"

#Working with Dictionaries
echo ${sounds[dog]} #Dog's sound
echo ${sounds[@]}   #All values
echo ${!sounds[@]}  #All keys
echo ${#sounds[@]}  #Number of elements
unset sounds[dog]   #Delete dog
echo ${sounds[@]}   #Updated dictionary
echo ""

#Iterating Over a Dictionary
echo "---------------"
echo "Iterating Over a Dictionary example (values):"
for val in "${sounds[@]}"; do
  echo $val
done
echo ""

echo "Iterating Over a Dictionary example (keys):"
for key in "${!sounds[@]}";  do
  echo $key
done
echo ""


#-------------------------------------------------------------------
#Accepting input

echo "--------------"
echo "Reading input example:"

echo -n "Proceed? [y/n]: "
read iNput
echo $iNput
echo ""

