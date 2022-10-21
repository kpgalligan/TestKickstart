// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://maven.pkg.github.com/kpgalligan/TestKickstart/github/kpgalligan/testkickstart/allshared-kmmbridge/0.1.0/allshared-kmmbridge-0.1.0.zip"
let remoteKotlinChecksum = "b61d5f403380dfd5ddc18d06e932c425586a8f7482ce0bb93e009eec15fc40cb"
let packageName = "allshared"

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)