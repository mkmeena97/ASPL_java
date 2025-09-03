# JSON Web Token (JWT) in Java

## **1. What is JWT?**
JSON Web Token (**JWT**) is a **compact**, **stateless**, and **URL-safe** token format used for securely transmitting information between parties as a **JSON object**. It is commonly used for authentication and authorization in web applications and APIs.

## **2. Structure of a JWT**
A JWT consists of three parts, separated by dots (`.`):

```
Header.Payload.Signature
```

Each part is encoded in **Base64URL** format.

### **2.1. Header**
The header contains metadata about the token, including the algorithm used for signing and the type of token.

Example:
```json
{
  "alg": "HS256",
  "typ": "JWT"
}
```

After Base64 encoding:
```
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9
```

---

### **2.2. Payload (Claims)**
The payload contains **claims**, which are statements about the user or token data.

#### **Types of Claims:**
1. **Registered Claims** (Standard claims defined by JWT specification):
   - `sub` (Subject) – User identifier.
   - `iss` (Issuer) – Who issued the token.
   - `exp` (Expiration) – Expiration timestamp.
   - `iat` (Issued At) – Token creation time.

2. **Public Claims**: Custom claims that applications can define.
3. **Private Claims**: Claims specific to a particular application or use case.

Example Payload:
```json
{
  "sub": "1234567890",
  "name": "John Doe",
  "admin": true,
  "exp": 1695290800
}
```

After Base64 encoding:
```
eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWV9
```

---

### **2.3. Signature**
The signature is used to verify that the token **has not been altered**.

It is created using the following formula:
```
HMACSHA256(
  base64UrlEncode(header) + "." +
  base64UrlEncode(payload),
  secret-key
)
```

After Base64 encoding:
```
SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c
```

---

## **3. Why Use JWT?**

### **Advantages:**
✅ **Stateless Authentication**: No need to store session data on the server.
✅ **Compact & URL-Safe**: Can be used in HTTP headers and URLs.
✅ **Cross-Domain Authentication**: Ideal for microservices.
✅ **Scalability**: No need to manage session state.

### **Disadvantages:**
❌ **Cannot Be Revoked Easily**: Once issued, it is valid until it expires unless additional mechanisms are implemented.
❌ **Larger Size Than Session IDs**: JWTs can be large, depending on the claims.
❌ **Security Risks**: If the token is exposed, it can be used until expiration.

---

## **4. Where is JWT Used?**
1. **Authentication:**
   - Used in Single Sign-On (SSO) mechanisms.
   - API authentication (Bearer tokens in HTTP headers).

2. **Authorization:**
   - Assign roles and permissions to users.

3. **Secure Data Exchange:**
   - Ensures data integrity between services.

4. **Microservices Communication:**
   - Stateless authentication between microservices.

5. **Mobile & Web Applications:**
   - Used in mobile apps and SPAs (Single Page Applications).

---

## **5. Types of JWT Signing Algorithms**
JWTs can be signed using different algorithms:

### **5.1. Symmetric Algorithms (HMAC)**
- **HS256** (HMAC with SHA-256) – Uses a single secret key for both signing and verification.
- **HS384, HS512** – Stronger variants of HS256.

### **5.2. Asymmetric Algorithms (RSA, ECDSA)**
- **RS256, RS384, RS512** (RSA with SHA-256/384/512)
  - Uses a **private key** to sign and a **public key** to verify.
  - More secure than HMAC.

- **ES256, ES384, ES512** (ECDSA with SHA-256/384/512)
  - Uses elliptic curve cryptography for signing.

**Recommended:** Use **RS256 or ES256** for better security.

---

## **6. Best Practices for JWT Security**

### ✅ **Security Best Practices:**
- **Use HTTPS**: Prevents Man-in-the-Middle (MITM) attacks.
- **Keep the Secret Key Safe**: Do not hardcode or expose it in public repositories.
- **Use Short Expiration Times**: Prevents prolonged misuse.
- **Use Refresh Tokens**: Generate new JWTs instead of long-lived access tokens.
- **Do Not Store Sensitive Data in JWT**: Avoid storing passwords or PII (Personally Identifiable Information).
- **Validate Tokens Properly**: Always check the signature and expiration before trusting a JWT.
- **Implement Token Revocation**: Use a blacklist or database to track invalidated tokens.

---

## **7. Alternatives to JWT**
JWT is widely used, but there are alternative mechanisms:

| Alternative | Description |
|------------|-------------|
| **OAuth 2.0** | An authorization framework that uses JWT as an access token. |
| **Session Tokens** | Traditional session-based authentication stored on the server. |
| **SAML (Security Assertion Markup Language)** | XML-based authentication mechanism, often used in enterprise SSO. |
| **PASETO (Platform-Agnostic Security Tokens)** | A secure alternative to JWT that avoids common pitfalls. |

---

## **8. When to Use JWT?**
### ✅ **Ideal Use Cases:**
- Stateless authentication in web and mobile applications.
- API authentication (OAuth 2.0, OpenID Connect).
- Microservices communication.

### ❌ **When NOT to Use JWT:**
- If you need frequent token invalidation (Use session-based authentication instead).
- If tokens contain sensitive user information (Use encrypted storage mechanisms).

---

## **Conclusion**
JWT is a powerful mechanism for authentication and secure data exchange in Java applications. It is widely used in APIs, microservices, and web applications due to its **stateless nature** and **security advantages**. However, proper security best practices must be followed to prevent vulnerabilities.

**Key Takeaways:**
- JWT is compact and stateless.
- It consists of a **Header**, **Payload**, and **Signature**.
- It is commonly used in authentication and authorization.
- **Security is critical**—use HTTPS, strong algorithms, and token expiration strategies.


