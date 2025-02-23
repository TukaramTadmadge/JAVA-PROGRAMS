import os
import pandas as pd

file_path = r"C:\Users\tukar\OneDrive\\Desktop\phishing website\\dataset.csv"
if os.path.exists(file_path):
    try:
        df = pd.read_csv(file_path)
        print(df.head())
    except Exception as e:
        print(f"An error occurred: {e}")
else:
    print(f"File not found: {file_path}")
