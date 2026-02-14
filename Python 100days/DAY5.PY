import random

print("🎮 Welcome to the Number Guessing Game!")

# Generate random number between 1 and 10
secret_number = random.randint(1, 10)

attempts = 0

while True:
    guess = int(input("Enter a number between 1 and 10: "))
    attempts += 1

    if guess < secret_number:
        print("Too low! Try again.")
    elif guess > secret_number:
        print("Too high! Try again.")
    else:
        print(f"🎉 Correct! You guessed it in {attempts} attempts.")
        break
