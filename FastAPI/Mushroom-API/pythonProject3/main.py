from typing import Optional
from fastapi import FastAPI

app = FastAPI()

@app.get("/value/{value}")
async def read_user_item(
        value: str
    ):
    item = {value}


    return item