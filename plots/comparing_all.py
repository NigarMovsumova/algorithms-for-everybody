import matplotlib.pyplot as plt
import numpy as np

n = np.linspace(1, 2)
plt.plot(n, n)
plt.plot(n, np.log(n))
plt.plot(n, pow(n, 2))
plt.plot(n, pow(2, n))

plt.legend(["1", "n", "log n", "n^2", "2^n"])
plt.show()
