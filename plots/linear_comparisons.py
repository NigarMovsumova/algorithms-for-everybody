import matplotlib.pyplot as plt
import numpy as np

n = np.linspace(0, 10)
plt.plot(n, 6 * n)
plt.plot(n, 6 * n + 7)
plt.plot(n, n)

plt.legend(["6n", "6n+7", "n"])
plt.show()
