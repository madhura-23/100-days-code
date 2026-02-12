import math

def logistic_growth(K, P0, r, t):
    return K / (1 + ((K - P0) / P0) * math.exp(-r * t))

# Example values
K = 1000      # carrying capacity
P0 = 50       # initial population
r = 0.3       # growth rate
t = 10        # time

result = logistic_growth(K, P0, r, t)
print("Population at time", t, "=", result)
