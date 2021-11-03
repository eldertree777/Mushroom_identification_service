from sklearn.linear_model import LogisticRegression
from sklearn import datasets
import pickle
import joblib
import pandas as pd
import numpy as np
from sklearn.preprocessing import LabelEncoder
from fastapi import FastAPI


app = FastAPI()

@app.get("/predict/{value}")
async def predict(value: str):
    model = joblib.load('model/nn_model.pkl')
    data = value.split(',')
    
    pre = model.predict([data])
    result = pre[0]
    result = int(result)

    return result
    