echo "Build $TRAVIS_JOB_NUMBER"
echo "Git: $TRAVIS_COMMIT [$TRAVIS_BRANCH]"
echo "Java version: $TRAVIS_JDK_VERSION"
CURRENT_TAG=$(git name-rev --name-only --tags HEAD)
if [ $CURRENT_TAG == 'undefined' ]
then
    echo "Promoting an untagged build on dartdesigner.github.io/p2/nightly"
	cd repositories/org.obeonetwork.dsl.dart.repository/target
	git clone https://$GITHUB_TOKEN@github.com/dartdesigner/p2.git -b gh-pages --quiet
	if [ -d p2/nightly ]
	then
	    rm -r p2/nightly
	    echo "An old version of the nightly repository has been found and removed"
	fi
	echo "Creating the nighly repository"
	cp -r repository p2/
	mv p2/repository p2/nightly
	echo "Nightly repository created"
	ls p2/nightly
	cd p2
	git config user.email "stephane.begaudeau@gmail.com"
    git config user.name "Stéphane Bégaudeau"
	git remote rm origin
	git remote add origin https://dartdesigner:$GITHUB_TOKEN@github.com/dartdesigner/p2.git  --quiet &>/dev/null
	git add -A
	git commit -m "Promoting a new nightly build for https://github.com/dartdesigner/Dart-Designer/commit/$TRAVIS_COMMIT [$TRAVIS_BRANCH]"
	git push origin gh-pages > /dev/null
	echo "Build promoted."
else
    if [ $TRAVIS_PULL_REQUEST == 'false' ]
    then
	    LAST_TAG=$(git describe --abbrev=0 --tags)
        echo "Promoting the release $LAST_TAG  on dartdesigner.github.io/p2/releases/$LAST_TAG"
		cd repositories/org.obeonetwork.dsl.dart.repository/target
		git clone https://$GITHUB_TOKEN@github.com/dartdesigner/p2.git -b gh-pages --quiet
		if [ -d p2/releases/$LAST_TAG ]
		then
			rm -r p2/releases/$LAST_TAG
			echo "An old version of the nightly repository has been found and removed"
		fi
		echo "Creating the nighly repository"
		cp -r repository p2/
		mkdir -p p2/releases
		mv p2/repository p2/releases/$LAST_TAG
		echo "Releases repository created"
		cd p2
		git config user.email "stephane.begaudeau@gmail.com"
		git config user.name "Stéphane Bégaudeau"
		git remote rm origin
		git remote add origin https://dartdesigner:$GITHUB_TOKEN@github.com/dartdesigner/p2.git  --quiet &>/dev/null
		git add -A
		git commit -m "Promoting a new nightly build for https://github.com/dartdesigner/Dart-Designer/commit/$TRAVIS_COMMIT [$TRAVIS_BRANCH]"
		git push origin gh-pages > /dev/null
		echo "Build promoted."
    fi
fi