import numpy as np
import pandas as pd
df = pd.read_csv('https://sololearn.com/uploads/files/titanic.csv')
df['male'] = df['Sex'] == 'male'
#X = df[['Pclass', 'male', 'Age', 'Siblings/Spouses', 'Parents/Children', 'Fare']].values
X = df[['Fare', 'Age']].values
y = df['Survived'].values
print(X)
print(y)
# line should be y = .0161x + -.0154y + -.510