#!/bin/bash
set -e

echo "🚀 Running tests..."
./gradlew test --no-daemon

echo "📊 Generating Allure report..."
allure generate build/allure-results --clean -o build/allure-report

echo "✅ Done. Report is inside build/allure-report"