import matplotlib.pyplot as plt
import numpy as np

n = np.linspace(0, 10)
plt.plot(n, pow(2, n))
plt.plot(n, pow(2, n+1))

plt.legend(["6n", "6n+7", "n"])
plt.show()
