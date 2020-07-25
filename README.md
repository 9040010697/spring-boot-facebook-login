# spring-security-single-sign-on-facebook

~~~
## How to get clientId & clientSecret?
login to url https://developers.facebook.com/ by your facebook username and password
Create a application by choosing Facebook Login as product 
Then go to settings->> basic->> and get clientId & clientSecret.

~~~


## application.yml for SSO config
~~~
security:
  oauth2:
    client:
      clientId: 732616604205708
      clientSecret: fa58843d392b93152037aac5d1fbec4c
      accessTokenUri: https://graph.facebook.com/oauth/access_token
      userAuthorizationUri: https://www.facebook.com/dialog/oauth
      tokenName: oauth_token
      authenticationScheme: query
      clientAuthenticationScheme: form
    resource:
      userInfoUri: https://graph.facebook.com/me
      
      ~~~
