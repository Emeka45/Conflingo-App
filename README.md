# Conflingo App

Private Android client for personal access to Conflingo.

## Current approach

This first build packages Conflingo's mobile web experience inside a dedicated Android application. It keeps the authenticated web session in the app, supports JavaScript/DOM storage, file selection for posts, in-app navigation, and external links.

Conflingo is currently rebuilding its official mobile experience, with iOS beta testing announced in September 2026 and Android planned. This private client is intended as a practical Android option while that work continues.

## Build

GitHub Actions builds a debug APK automatically on pushes to `main` or manually from the Actions tab.

## Privacy

The app does not add analytics or advertising code of its own. Conflingo's own web service policies still apply because the app connects to Conflingo.
