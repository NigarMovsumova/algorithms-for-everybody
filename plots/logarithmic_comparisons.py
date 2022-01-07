import matplotlib.pyplot as plt
import numpy as np

n = np.linspace(0, 10)
plt.plot(n, np.log(n))
plt.plot(n, 2 * np.log(n))

plt.legend(["log n", "(log n)^3"])
plt.show()
