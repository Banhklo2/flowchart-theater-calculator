# 🎬 FlowChart Theater Calculator

**FlowChart로 영화관 결제 및 포인트 적립 로직을 설계하고 Java로 구현한 연습**

---

## ✅ 시나리오: 영화관 포인트 적립 시스템

- 사용자가 영화를 여러 편 볼 때마다 **관람 가격(price)** 을 입력한다.
- 영화 1편 관람 시 결제 금액의 **7%가 포인트로 적립**된다.
- 사용자가 **-1**을 입력하면 관람 입력을 종료하고,
  **총 결제 금액(totalPrice)** 과 **총 적립 포인트(totalPoint)** 를 출력한다.
- 가격이 **0 이하(단, -1 제외)** 인 경우는 잘못된 입력이며 다시 입력받는다.

---

## 🧩 FlowChart

![플로우차트 2주차 연습문제](https://github.com/user-attachments/assets/b76a07f1-66b8-485b-b5b7-67b918e263ff)

---

## 📌 입력/출력 정리

### 입력(Input)
- 관람 가격 `price`

### 출력(Output)
- 총 결제 금액 `totalPrice`
- 총 적립 포인트 `totalPoint`

### 상태(State)
- `totalPrice` : 누적 결제 금액
- `totalPoint` : 누적 적립 포인트

---

## 🔎 조건 정리

### 종료 조건
- `price == -1`

### 정상 처리 조건
- `price > 0`

### 예외/에러 조건
- `price <= 0 && price != -1`
  - `"잘못된 입력입니다!"` 출력 후 다시 입력받기

---

## 🔁 로직 흐름 설계

1. 시작 시 한 번만 초기화  
   - `totalPrice = 0`
   - `totalPoint = 0`

2. 반복
   1) 관람 가격 입력  
   2) `price == -1` 이면 종료 출력 후 종료  
   3) `price > 0` 이면  
      - `totalPrice += price`  
      - `totalPoint += price * 0.07`  
   4) 그 외(0 이하)면  
      - `"잘못된 입력입니다!"` 출력 후 반복

3. 종료 시
- `totalPrice`, `totalPoint` 출력

---

## 🛠️ 실행 방법

```bash
# 컴파일
javac Main.java

# 실행
java Main
