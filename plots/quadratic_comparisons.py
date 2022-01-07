import matplotlib.pyplot as plt
import numpy as np

n = np.linspace(0, 10)
plt.plot(n, 7 * n * n + 6 * n)
plt.plot(n, 3 * n * n + 6 * n + 7)
plt.plot(n, pow(n, 2))

plt.legend(["7n^2+6n", "3n^2+6n+7", "n^2"])
plt.show()
