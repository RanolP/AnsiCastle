[jansi-repo]: https://github.com/fusesource/jansi
[jansi-prs]: https://github.com/fusesource/jansi/pulls

[crayon-repo]: https://github.com/importre/crayon
[mordant-repo]: https://github.com/ajalt/mordant

[siege-of-ansi]: https://en.wikipedia.org/wiki/Siege_of_Ansi

[RanolP]: https://github.com/RanolP

[contributors]: https://github.com/RanolP/AnsiCastle/contributors
[CONTRIBUTING.md]: https://github.com/RanolP/AnsiCastle/blob/master/CONTRIBUTING.md
[license-page]: https://github.com/RanolP/AnsiCastle/blob/master/LICENSE
[SemVer]: https://semver.org/
[tags]: https://github.com/RanolP/AnsiCastle/tags

[jitpack-badge]: https://jitpack.io/v/RanolP/AnsiCastle.svg
[jitpack-page]: https://jitpack.io/#RanolP/AnsiCastle

[bintray-badge]: https://api.bintray.com/packages/ranol-github/maven/AnsiCastle/images/download.svg
[bintray-page]: https://bintray.com/ranol-github/maven/AnsiCastle/_latestVersion

[license-badge]: https://img.shields.io/github/license/RanolP/AnsiCastle.svg

[jitpack-javadoc]: https://jitpack.io/com/github/RanolP/AnsiCastle/v0.1.0/javadoc/

[![license][license-badge]][license-page]

# AnsiCastle
Ansi utility which is alternative of [fusesource/jansi][jansi-repo]

## Getting Started

### Install

#### via Jitpack

Latest version [![jitpack version][jitpack-badge]][jitpack-page]

Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.RanolP</groupId>
        <artifactId>AnsiCastle</artifactId>
        <version>v0.1.0</version>
    </dependency>
</dependencies>
```

Gradle
```gradle
repositories {
    ...
    maven {
        url = 'https://jitpack.io'
    }
}

dependencies {
    ...
    implementation group: 'com.github.RanolP', name: 'AnsiCastle', version: 'v0.1.0'
}
```

#### via Bintray

Latest version [![bintray version][bintray-badge]][bintray-page]

Maven
```xml
<repositories>
    <repository>
        <id>jcenter</id>
        <name>jcenter-bintray</name>
        <url>http://jcenter.bintray.com</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>io.github.ranolp</groupId>
        <artifactId>AnsiCastle</artifactId>
        <version>0.1.0</version>
        <type>pom</type>
    </dependency>
</dependencies>
```

Gradle
```gradle
repositories {
    ...
    jcenter()
}

dependencies {
    ...
    implementation group: 'io.github.ranolp', name: 'AnsiCastle', version: '0.1.0'
}
```

## Documentation

Api Documentations are hosted on [jitpack (v0.1.0)][jitpack-javadoc]

## Contributing
Please read [CONTRIBUTING.md][CONTRIBUTING.md] for details on our code of conduct,
and the process for submitting pull requests to us.

## Versioning
We use [SemVer][SemVer] for versioning. For the versions available, see the [tags on this repository][tags].

## Authors

- RanolP - *Project Maintainer* - [RanolP]

See also the list of [contributors] who participated in this project.

## License
This project is licensed under the MIT License -
see the [LICENSE][license-page] file for details

## Why this project exists?

I think the [jansi][jansi-repo] project is dead.
last commit is two months ago,
four [PRs][jansi-prs] are not reviewed and not merged.
And I don't like the api of jansi. :smiley:

For the reasons, I made this project.

## Acknowledgments

- Api style inspired by [importre/crayon][crayon-repo] and [ajalt/mordant][mordant-repo]
- Name inspired by Ansi castle/안시성(安市城) where the [Siege of Ansi][siege-of-ansi] occured.
