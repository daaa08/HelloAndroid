# HelloAndroid
travis 예시
- travis 온라인 자동 컴파일 툴
- 사용을 위해서는 .travis.yml파일 생성 후 작성 해 줘야함

```java
language: android

jdk: oraclejdk8

android:
  components:
  - platform-tools             # ADB (디바이스 또는 에뮬레이터와 통신) 포함
  - tools                      # 실제 안드로이드 SDK
  - build-tools-25.0.2         # 빌드 툴 버전
  - android-25                 # 타겟 버전
  - extra-android-m2repository # 안드로이드에서 제공하는 라이브러리

  licenses:
    # Check licenses: http://docs.travis-ci.com/user/languages/android/#Dealing-with-Licenses
    # By default Travis will accept all the licenses, but it's also possible to define a white list:
    # White list current android-sdk-license revision.
    # - 'android-sdk-license-5be876d5'
    # White list all android-sdk-license revisions.
    # - 'android-sdk-license-.+'
    # White list all the licenses.
    - '.+'

before_install:
  - chmod +x gradlew
  - mkdir "$ANDROID_HOME/licenses" || true
  - echo -e "\n8933bad161af4178b1185d1a37fbf41ea5269c55" > "$ANDROID_HOME/licenses/android-sdk-license"
  - echo -e "\n84831b9409646a918e30573bab4c9c91346d8abd" > "$ANDROID_HOME/licenses/android-sdk-preview-license"

script: ./gradlew build

```
