import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression

# Dataset (x = independent variable, y = dependent variable)
x = np.array([1, 2, 3, 4, 5])            # years of experience
y = np.array([30000, 35000, 40000, 45000, 50000])  # salary

# Reshape x for sklearn
x_reshaped = x.reshape(-1, 1)

# Create & fit the model
model = LinearRegression()
model.fit(x_reshaped, y)

# Predict y values for plotting line
y_pred = model.predict(x_reshaped)

# --------------------- PLOT ---------------------
plt.scatter(x, y, label="Actual Data (Points)")    # plot actual data
plt.plot(x, y_pred, label="Regression Line")       # plot regression line

plt.xlabel("Years of Experience")
plt.ylabel("Salary")
plt.title("Simple Linear Regression")
plt.legend()
plt.grid(True)

plt.show()
