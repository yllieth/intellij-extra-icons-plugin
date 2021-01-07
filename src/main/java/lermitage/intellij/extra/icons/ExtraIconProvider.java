// SPDX-License-Identifier: MIT

package lermitage.intellij.extra.icons;

import com.intellij.openapi.project.DumbAware;
import lermitage.intellij.extra.icons.enablers.IconEnablerType;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static java.util.Arrays.asList;
import static lermitage.intellij.extra.icons.Model.ofDir;
import static lermitage.intellij.extra.icons.Model.ofFile;

public class ExtraIconProvider extends BaseIconProvider implements DumbAware {

    private static final String[] TXT = new String[]{".md", ".txt", ".adoc", ".rst"};
    private static final String[] CFG = new String[]{".xml", ".yml", ".yaml", ".properties", ".json", ".cfg", ".conf", ".ini", ".txt"};
    private static final String[] YML = new String[]{".yaml", ".yml"};

    @NotNull
    public static List<Model> allModels() {
        return asList(

            //
            // custom
            //
            ofFile("custom_jle1", "/extra-icons/bash.svg", "Custom: do").eq("do"),

            //
            // regex (directory)
            //
            ofDir("dir_circleci", "/extra-icons/folder_circleci.svg", "Circle CI (regex): '^/\\.circleci$' folder")
                .regex("^/\\.circleci$")
                .eq(".circleci"), // FIXME #13 temp fix
            ofDir("dir_dependabot", "/extra-icons/folder_dependabot.png", "Dependabot (regex): '^/\\.dependabot$' folder")
                .regex("^/\\.dependabot$")
                .eq(".dependabot"), // FIXME #13 temp fix
            ofDir("dir_docker", "/extra-icons/folder_docker.svg", "Docker (regex): '^/docker$' folder")
                .regex("^/docker$")
                .eq("docker"), // FIXME #13 temp fix
            ofDir("dir_github", "/extra-icons/folder_github.svg", "Github (regex): '^/\\.github$' folder")
                .regex("^/\\.github$")
                .eq(".github"), // FIXME #13 temp fix
            ofDir("dir_gitlab", "/extra-icons/folder_gitlab.svg", "Gitlab (regex): '^/\\.gitlab$' folder")
                .regex("^/\\.gitlab$")
                .eq(".gitlab"), // FIXME #13 temp fix
            ofDir("dir_gradle", "/extra-icons/folder_gradle.svg", "Gradle (regex): '^/gradle$' folder")
                .regex("^/gradle$")
                .eq("gradle"), // FIXME #13 temp fix
            ofDir("dir_idea", "/extra-icons/folder_idea.svg", "IntelliJ IDEA (regex): '^/\\.idea$' folder")
                .regex("^/\\.idea$")
                .eq(".idea"), // FIXME #13 temp fix
            ofDir("dir_ideasandbox", "/extra-icons/folder_idea.svg", "IntelliJ IDEA (regex): '^/\\.?idea-sandbox$' folder")
                .regex("^/\\.?idea-sandbox$")
                .eq(".idea-sandbox", "idea-sandbox"), // FIXME #13 temp fix
            ofDir("dir_idearun", "/extra-icons/folder_idea.svg", "IntelliJ IDEA 2020+ Run/Debug Configurations (regex): '^/\\.run' folder")
                .regex("^/\\.run$")
                .eq(".run"), // FIXME #13 temp fix
            ofDir("dir_mps", "/extra-icons/folder_idea.svg", "JetBrains MPS (regex): '^/\\.mps$' folder")
                .regex("^/\\.mps$")
                .eq(".mps"), // FIXME #13 temp fix
            ofDir("dir_mvn", "/extra-icons/folder_mvnw.svg", "Maven (regex): '^/\\.mvn$' folder")
                .regex("^/\\.mvn$")
                .eq(".mvn"), // FIXME #13 temp fix
            ofDir("dir_nuget", "/extra-icons/folder_nuget.svg", "Nuget (regex): '^/\\.nuget$' folder")
                .regex("^/\\.nuget")
                .eq(".nuget"), // FIXME #13 temp fix
            ofDir("dir_teamcity", "/extra-icons/folder_teamcity.svg", "TeamCity (regex): '^/\\.teamcity$' folder")
                .regex("^/\\.teamcity")
                .eq(".teamcity"), // FIXME #13 temp fix
            ofDir("dir_vscode_settings", "/extra-icons/folder_vscode.svg", "Visual Studio Code (regex): '^/\\.vscode$' folder")
                .regex("^/\\.vscode$")
                .eq(".vscode"), // FIXME #13 temp fix
            ofDir("dir_semaphoreci", "/extra-icons/folder_semaphoreci.svg", "Semaphore (regex): '^/\\.semaphore' folder")
                .regex("^/\\.semaphore$")
                .eq(".semaphore"), // FIXME #13 temp fix
            // - Flyway databases
            ofDir("dir_flyway_db2", "/extra-icons/folder_db2.svg", "Flyway, IBM DB2 database folder (regex): '.*/db/migration/db2[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/migration/db2[a-zA-Z0-9._\\-]*"),
            ofDir("dir_flyway_h2", "/extra-icons/folder_h2.svg", "Flyway, H2 database folder (regex): '.*/db/migration/h2[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/migration/h2[a-zA-Z0-9._\\-]*"),
            ofDir("dir_flyway_hsqldb", "/extra-icons/folder_hsqldb.svg", "Flyway, HSQLDB database folder (regex): '.*/db/migration/hsqldb[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/migration/hsqldb[a-zA-Z0-9._\\-]*"),
            ofDir("dir_flyway_mariadb", "/extra-icons/folder_mariadb.svg", "Flyway, MariaDB database folder (regex): '.*/db/migration/maria[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/migration/maria[a-zA-Z0-9._\\-]*"),
            ofDir("dir_flyway_mysql", "/extra-icons/folder_mysql.svg", "Flyway, MySQL database folder (regex): '.*/db/migration/mysql[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/migration/mysql[a-zA-Z0-9._\\-]*"),
            ofDir("dir_flyway_postgresql", "/extra-icons/folder_postgresql.svg", "Flyway, PostgreSQL database folder (regex): '.*/db/migration/postgre[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/migration/postgre[a-zA-Z0-9._\\-]*"),
            ofDir("dir_flyway_sqlite", "/extra-icons/folder_sqlite.svg", "Flyway, Sqlite database folder (regex): '.*/db/migration/sqlite[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/migration/sqlite[a-zA-Z0-9._\\-]*"),
            ofDir("dir_flyway_oracle", "/extra-icons/folder_oracle.svg", "Flyway, Oracle database folder (regex): '.*/db/migration/oracle[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/migration/oracle[a-zA-Z0-9._\\-]*"),
            ofDir("dir_flyway_sqlserver", "/extra-icons/folder_sqlserver.svg", "Flyway, MS SQL Server database folder (regex): '.*/db/migration/sqlserver[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/migration/sqlserver[a-zA-Z0-9._\\-]*"),
            ofDir("dir_flyway_mssql", "/extra-icons/folder_sqlserver.svg", "Flyway, MS SQL Server database folder (regex): '.*/db/migration/mssql[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/migration/mssql[a-zA-Z0-9._\\-]*"),
            // - Liquibase databases
            ofDir("dir_liquibase_db2", "/extra-icons/folder_db2.svg", "Liquibase, IBM DB2 database folder (regex): '.*/db/changelog/db2[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/changelog/db2[a-zA-Z0-9._\\-]*"),
            ofDir("dir_liquibase_h2", "/extra-icons/folder_h2.svg", "Liquibase, H2 database folder (regex): '.*/db/changelog/h2[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/changelog/h2[a-zA-Z0-9._\\-]*"),
            ofDir("dir_liquibase_hsqldb", "/extra-icons/folder_hsqldb.svg", "Liquibase, HSQLDB database folder (regex): '.*/db/changelog/hsqldb[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/changelog/hsqldb[a-zA-Z0-9._\\-]*"),
            ofDir("dir_liquibase_mariadb", "/extra-icons/folder_mariadb.svg", "Liquibase, MariaDB database folder (regex): '.*/db/changelog/maria[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/changelog/maria[a-zA-Z0-9._\\-]*"),
            ofDir("dir_liquibase_mysql", "/extra-icons/folder_mysql.svg", "Liquibase, MySQL database folder (regex): '.*/db/changelog/mysql[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/changelog/mysql[a-zA-Z0-9._\\-]*"),
            ofDir("dir_liquibase_postgresql", "/extra-icons/folder_postgresql.svg", "Liquibase, PostgreSQL database folder (regex): '.*/db/changelog/postgre[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/changelog/postgre[a-zA-Z0-9._\\-]*"),
            ofDir("dir_liquibase_sqlite", "/extra-icons/folder_sqlite.svg", "Liquibase, Sqlite database folder (regex): '.*/db/changelog/sqlite[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/changelog/sqlite[a-zA-Z0-9._\\-]*"),
            ofDir("dir_liquibase_oracle", "/extra-icons/folder_oracle.svg", "Liquibase, Oracle database folder (regex): '.*/db/changelog/oracle[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/changelog/oracle[a-zA-Z0-9._\\-]*"),
            ofDir("dir_liquibase_sqlserver", "/extra-icons/folder_sqlserver.svg", "Liquibase, MS SQL Server database folder (regex): '.*/db/changelog/sqlserver[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/changelog/sqlserver[a-zA-Z0-9._\\-]*"),
            ofDir("dir_liquibase_mssql", "/extra-icons/folder_sqlserver.svg", "Liquibase, MS SQL Server database folder (regex): '.*/db/changelog/mssql[a-zA-Z0-9._\\-]*'")
                .regex(".*/db/changelog/mssql[a-zA-Z0-9._\\-]*"),

            //
            // regex (file)
            //
            ofFile("angular_module_generic", "/extra-icons/angular-module.svg", "AngularJS: *.module.(js|ts)")
                .regex(".*[^a-zA-Z0-9]module\\.(js|ts)"),
            ofFile("angular_component_generic", "/extra-icons/angular-component.svg", "AngularJS: *.(component|controller).(js|ts)")
                .regex(".*[^a-zA-Z0-9](component|controller)\\.(js|ts)"),
            ofFile("angular_service_generic", "/extra-icons/angular-service.svg", "AngularJS: *.service.(js|ts)")
                .regex(".*[^a-zA-Z0-9]service\\.(js|ts)"),
            ofFile("angular_pipe_generic", "/extra-icons/angular-pipe.svg", "AngularJS: *.pipe.(js|ts)")
                .regex(".*[^a-zA-Z0-9]pipe\\.(js|ts)"),
            ofFile("angular_directive_generic", "/extra-icons/angular-directive.svg", "AngularJS: *.directive.(js|ts)")
                .regex(".*[^a-zA-Z0-9]directive(s)?\\.(js|ts)"),
            ofFile("angular_guard_generic", "/extra-icons/angular-guard.svg", "AngularJS: *.guard.(js|ts)")
                .regex(".*[^a-zA-Z0-9]guard\\.(js|ts)"),
            ofFile("angular_resolver_generic", "/extra-icons/angular-resolver.svg", "AngularJS: *.resolver.(js|ts)")
                .regex(".*[^a-zA-Z0-9]resolver\\.(js|ts)"),
            ofFile("angular_spec_generic", "/extra-icons/test-ts.svg", "AngularJS: *.spec.(js|ts)")
                .regex(".*[^a-zA-Z0-9]spec\\.(js|ts)"),
            ofFile("flyway", "/extra-icons/flyway.png", "Flyway (regex): '.*/db/migration/.*\\.sql'")
                .regex(".*/db/migration/.*\\.sql"),
            ofFile("liquibase", "/extra-icons/liquibase.svg", "Liquibase (regex): '.*/db/changelog/.*\\.(sql|xml)'")
                .regex(".*/db/changelog/.*\\.(sql|xml)"),
            ofFile("mockk", "/extra-icons/mockk.svg", "Mockk: io/mockk/settings.properties")
                .regex(".*/io/mockk/settings\\.properties"),

            //
            // file plus its containing folder
            //
            ofFile("dependabot_config", "/extra-icons/dependabot.png", "Dependabot: .dependabot/config.yml")
                .eq("config.yml").parents(".dependabot"),
            ofFile("golwroot", "/extra-icons/glowroot.png", "Glowroot: glowroot/admin.json and glowroot/config.json")
                .eq("admin.json", "config.json").parents("glowroot"),
            ofFile("nuget", "/extra-icons/nuget.svg", "Nuget: .nuget/packages.config")
                .eq("packages.config").parents(".nuget"),
            ofFile("onap_cba_blueprint", "/extra-icons/onap-cba-blueprint.svg", "ONAP CBA: Definitions/*blueprint.json")
                .end("blueprint.json").parents("definitions"),
            ofFile("onap_cba_definitions", "/extra-icons/onap-cba-definitions.svg", "ONAP CBA: Definitions/*(artifact_types, data_types, node_types, relationship_types, resources_definition_types).json")
                .end("artifact_types.json", "data_types.json", "node_types.json", "relationship_types.json", "resources_definition_types.json").parents("definitions"),
            ofFile("onap_cba_tosca", "/extra-icons/onap-cba-tosca.svg", "ONAP CBA: TOSCA-Metadata/*TOSCA.meta")
                .end("tosca.meta").parents("tosca-metadata"),
            ofFile("semaphoreci", "/extra-icons/semaphoreci.svg", "Semaphore: .semaphore/semaphore.yml")
                .eq("semaphore.yml").parents(".semaphore"),
            ofFile("vscode_settings", "/extra-icons/vscode.svg", "Visual Studio Code: .vscode/settings.json")
                .eq("settings.json").parents(".vscode"),

            //
            // file plus extension
            //
            ofFile("vcskeep", "/extra-icons/keep.svg", "Various VCS: .keep, .gitkeep, .hgkeep, .svnkeep")
                .eq(".keep", ".gitkeep", ".hgkeep", ".svnkeep"),
            ofFile("htaccess", "/extra-icons/htaccess.svg", "Apache: .htaccess")
                .eq(".htaccess"),
            ofFile("appveyor", "/extra-icons/appveyor.svg", "Appveyor: appveyor.yml, .appveyor.yml")
                .eq("appveyor.yml", ".appveyor.yml"),
            ofFile("allcontributors", "/extra-icons/allcontributors.svg", "All Contributors: .all-contributorsrc")
                .eq(".all-contributorsrc"),
            ofFile("archunit", "/extra-icons/archunit.png", "ArchUnit: archunit.properties")
                .eq("archunit.properties"),
            ofFile("author", "/extra-icons/authors.png", "Author: author(.md,.txt,.adoc,.rst), authors")
                .eq("author", "authors").mayEnd(TXT),
            ofFile("author_alt", "/extra-icons/authors_alt.svg", "Author: author(.md,.txt,.adoc,.rst), authors (alternative 1)")
                .eq("author", "authors").mayEnd(TXT),
            ofFile("author_alt2", "/extra-icons/authors_alt2.svg", "Author: author(.md,.txt,.adoc,.rst), authors (alternative 2)")
                .eq("author", "authors").mayEnd(TXT),
            ofFile("author_alt3", "/extra-icons/authors_alt3.svg", "Author: author(.md,.txt,.adoc,.rst), authors (alternative 3)")
                .eq("author", "authors").mayEnd(TXT),
            ofFile("author_alt4", "/extra-icons/authors_alt4.svg", "Author: author(.md,.txt,.adoc,.rst), authors (alternative 4)")
                .eq("author", "authors").mayEnd(TXT),
            ofFile("bamboo", "/extra-icons/bamboo.png", "Bamboo: bamboo.yml")
                .eq("bamboo.yml"),
            ofFile("cargo", "/extra-icons/cargo.png", "Cargo: cargo.toml")
                .eq("cargo.toml"),
            ofFile("gradle_main", "/extra-icons/gradle.svg", "Gradle: build.gradle, gradle.properties, settings.gradle")
                .eq("build.gradle", "gradle.properties", "settings.gradle"),
            ofFile("gradle_kotlin", "/extra-icons/gradle.svg", "Gradle (Kotlin DSL): build.gradle.kts, settings.gradle.kts")
                .eq("build.gradle.kts", "settings.gradle.kts"),
            ofFile("gradle", "/extra-icons/gradlew.svg", "Gradle: gradlew")
                .eq("gradlew"),
            ofFile("gradlew", "/extra-icons/gradlew.svg", "Gradle (Windows): gradlew.bat, gradlew.cmd")
                .eq("gradlew.bat", "gradlew.cmd"),
            ofFile("gradle_wrapper", "/extra-icons/gradle.svg", "Gradle Wrapper: gradle-wrapper.jar, gradle-wrapper.properties")
                .eq("gradle-wrapper.jar", "gradle-wrapper.properties"),
            ofFile("mvnw_linux", "/extra-icons/mvnw.svg", "Maven: mvnw")
                .eq("mvnw"),
            ofFile("berksfile", "/extra-icons/berkshelf.png", "Berkshelf: berksfile")
                .eq("berksfile"),
            ofFile("berksfilelock", "/extra-icons/berkshelflock.png", "Berkshelf: berksfile.lock")
                .eq("berksfile.lock"),
            ofFile("bettercodehub", "/extra-icons/bettercodehub.svg", "Better Code Hub: .bettercodehub.yml")
                .eq(".bettercodehub.yml"),
            ofFile("bitbucket", "/extra-icons/bitbucket.svg", "Bitbucket: bitbucket-pipelines.yml")
                .eq("bitbucket-pipelines").end(YML),
            ofFile("bower", "/extra-icons/bower.svg", "Bower: bower.json, .bowerrc")
                .eq("bower.json", ".bowerrc"),
            ofFile("browserslist", "/extra-icons/browserslist.svg", "Browserslist: browserslist, .browserslistrc")
                .eq("browserslist", ".browserslistrc"),
            ofFile("build", "/extra-icons/build.png", "Build: build(.md,.txt,.adoc,.rst), building")
                .eq("build", "building").mayEnd(TXT),
            ofFile("cassandra", "/extra-icons/cassandra.svg", "Cassandra: cassandra(.yml,.yaml)")
                .eq("cassandra").mayEnd(YML),
            ofFile("cassandra1", "/extra-icons/cassandra.svg", "Cassandra: start by 'cassandra' and end by '.yml,.yaml'")
                .start("cassandra").end(YML),
            ofFile("changelog", "/extra-icons/changelog.svg", "Changelog: changelog(.md,.txt,.adoc,.rst), changes, release-notes, release_notes, releasenotes")
                .eq("changelog", "changes", "release-notes", "release_notes", "releasenotes").mayEnd(TXT),
            ofFile("circle", "/extra-icons/circleci.svg", "Circle CI: circle.yml")
                .eq("circle.yml"),
            ofFile("circle1", "/extra-icons/circleci.svg", "Circle CI: .circleci/config.yml")
                .eq("config.yml").parents(".circleci"),
            ofFile("cirrus", "/extra-icons/cirrus.png", "Cirrus CI: .cirrus.yml")
                .eq(".cirrus.yml"),
            ofFile("composer", "/extra-icons/composer.svg", "Composer: composer.json, composer.lock")
                .eq("composer.json", "composer.lock"),
            ofFile("mvnw_windows", "/extra-icons/mvnw.svg", "Maven (Windows): mvnw.bat, mvnw.cmd")
                .eq("mvnw.bat", "mvnw.cmd"),
            ofFile("codecov", "/extra-icons/codecov.svg", "CodeCov: .codecov.yml, codecov.yml")
                .eq(".codecov.yml", "codecov.yml"),
            ofFile("codefresh", "/extra-icons/codefresh.png", "Codefresh: codefresh.yml")
                .eq("codefresh.yml"),
            ofFile("codacy", "/extra-icons/codacy.png", "Codacy: .codacy(.yml,.yaml)")
                .eq(".codacy").mayEnd(YML),
            ofFile("codeship", "/extra-icons/codeship.png", "Codeship steps: codeship-steps(.xml,.yml,...)")
                .eq("codeship-steps").mayEnd(CFG),
            ofFile("contact", "/extra-icons/contact.png", "Contact: contact(.md,.txt,.adoc,.rst), contacts")
                .eq("contact", "contacts").mayEnd(TXT),
            ofFile("contribute", "/extra-icons/contributing.png", "Contribution: contribute(.md,.txt,.adoc,.rst), contributing, contribution")
                .eq("contribute", "contributing", "contribution").mayEnd(TXT),
            ofFile("contribute_alt", "/extra-icons/contributing_alt.svg", "Contribution: contribute(.md,.txt,.adoc,.rst), contributing, contribution (alternative)")
                .eq("contribute", "contributing", "contribution").mayEnd(TXT),
            ofFile("coveragerc", "/extra-icons/coveragerc.svg", "Python coverage: .coveragerc")
                .eq(".coveragerc"),
            ofFile("crowdin", "/extra-icons/crowdin.svg", "Crowdin: .crowdin.yml")
                .eq(".crowdin.yml"),
            ofFile("deptective", "/extra-icons/deptective.png", "Deptective: deptective.json")
                .eq("deptective.json"),
            ofFile("docker", "/extra-icons/docker.png", "Docker: dockerfile(.xml,.yml,...)")
                .eq("dockerfile").mayEnd(CFG),
            ofFile("docker_alt", "/extra-icons/docker_alt.png", "Docker: dockerfile(.xml,.yml,...) (alternative 1)")
                .eq("dockerfile").mayEnd(CFG),
            ofFile("docker_alt2", "/extra-icons/docker_alt2.svg", "Docker: dockerfile(.xml,.yml,...) (alternative 2)")
                .eq("dockerfile").mayEnd(CFG),
            ofFile("dockercompose", "/extra-icons/dockercompose.png", "Docker: docker-compose")
                .eq("docker-compose").mayEnd(CFG),
            ofFile("dockercompose_alt", "/extra-icons/dockercompose_alt.png", "Docker: docker-compose (alternative 1)")
                .eq("docker-compose").mayEnd(CFG),
            ofFile("dockercompose_alt2", "/extra-icons/dockercompose_alt2.svg", "Docker: docker-compose (alternative 2)")
                .eq("docker-compose").mayEnd(CFG),
            ofFile("docker1", "/extra-icons/docker.png", "Docker: start by 'dockerfile' and end by '.xml,.yml,...'")
                .start("dockerfile").end(CFG),
            ofFile("docker1_alt", "/extra-icons/docker_alt.png", "Docker: start by 'dockerfile' and end by '.xml,.yml,...' (alternative 1)")
                .start("dockerfile").end(CFG),
            ofFile("docker1_alt2", "/extra-icons/docker_alt2.svg", "Docker: start by 'dockerfile' and end by '.xml,.yml,...' (alternative 2)")
                .start("dockerfile").end(CFG),
            ofFile("dockercompose1", "/extra-icons/dockercompose.png", "Docker: start by 'docker-compose' and end by '.xml,.yml,...'")
                .start("docker-compose").end(CFG),
            ofFile("dockercompose1_alt", "/extra-icons/dockercompose_alt.png", "Docker: start by 'docker-compose' and end by '.xml,.yml,...' (alternative 1)")
                .start("docker-compose").end(CFG),
            ofFile("dockercompose1_alt2", "/extra-icons/dockercompose_alt2.svg", "Docker: start by 'docker-compose' and end by '.xml,.yml,...' (alternative 2)")
                .start("docker-compose").end(CFG),
            ofFile("dockerignore", "/extra-icons/dockerignore.png", "Docker: .dockerignore")
                .eq(".dockerignore"),
            ofFile("dockerignore_alt", "/extra-icons/dockerignore_alt.png", "Docker: .dockerignore (alternative 1)")
                .eq(".dockerignore"),
            ofFile("dockerignore_alt2", "/extra-icons/dockerignore_alt2.svg", "Docker: .dockerignore (alternative 2)")
                .eq(".dockerignore"),
            ofFile("editorconfig", "/extra-icons/editorconfig.png", "EditorConfig: .editorconfig")
                .eq(".editorconfig").mayEnd(CFG),
            ofFile("editorconfig_alt", "/extra-icons/editorconfig_alt.svg", "EditorConfig: .editorconfig (alternative)")
                .eq(".editorconfig").mayEnd(CFG),
            ofFile("elastic", "/extra-icons/elasticsearch.png", "Elasticsearch: elastic(.yml,.yaml)")
                .eq("elastic").mayEnd(YML),
            ofFile("elastic1", "/extra-icons/elasticsearch.png", "Elasticsearch: start by 'elastic' and end by '.yml,.yaml'")
                .start("elastic").end(YML),
            ofFile("cerebro", "/extra-icons/elastic-cerebro.png", "Cerebro: cerebro(.conf)")
                .eq("cerebro").mayEnd(".conf"),
            ofFile("cerebro1", "/extra-icons/elastic-cerebro.png", "Cerebro: start by 'cerebro' and end by '.conf'")
                .start("cerebro").end(".conf"),
            ofFile("intellijcodestyle", "/extra-icons/jetbrains.svg", "IntelliJ: intellijcodestyle.xml")
                .eq("intellijcodestyle.xml"),
            ofFile("mailmap", "/extra-icons/email.svg", "Mailmap: .mailmap")
                .eq(".mailmap"),
            ofFile("msazure", "/extra-icons/msazure.svg", "Microsoft Azure: azure-pipelines.yml")
                .eq("azure-pipelines.yml"),
            ofFile("msazure1", "/extra-icons/msazure.svg", "Microsoft Azure: start by 'azure-pipelines' and end by '.yml'")
                .start("azure-pipelines").end(".yml"),
            ofFile("gatling", "/extra-icons/gatling.png", "Gatling: gatling(.conf)")
                .eq("gatling").mayEnd(".conf"),
            ofFile("gatling1", "/extra-icons/gatling.png", "Gatling: start by 'gatling' and end by '.conf'")
                .start("gatling").end(".conf"),
            ofFile("gitpod", "/extra-icons/gitpod.svg", "Gitpod: .gitpod.yml")
                .start(".gitpod").end(YML),
            ofFile("grunt", "/extra-icons/grunt.svg", "Grunt: Gruntfile.js")
                .eq("gruntfile.js"),
            ofFile("git", "/extra-icons/git.svg", "Git: .gitattributes, .gitignore, .gitmodules, .gitreview")
                .eq(".gitattributes", ".gitignore", ".gitmodules", ".gitreview"),
            ofFile("gitlab", "/extra-icons/gitlab.svg", "Gitlab: .gitlab-ci.yml")
                .eq(".gitlab-ci.yml"),
            ofFile("graphqlconfig", "/extra-icons/graphql-config.png", "GraphQL: graphql.config.json")
                .eq("graphql.config.json"),
            ofFile("grafana", "/extra-icons/grafana.svg", "Grafana: grafana.ini")
                .eq("grafana.ini"),
            ofFile("graphqlschema", "/extra-icons/graphql-schema.png", "GraphQL: graphql.schema.json")
                .eq("graphql.schema.json"),
            ofFile("gocd", "/extra-icons/gocd.png", "Gocd: .gocd(.xml,.yml,...)")
                .eq(".gocd").mayEnd(CFG),
            ofFile("hibernate", "/extra-icons/hibernate.svg", "Hibernate: hibernate.properties")
                .eq("hibernate.properties"),
            ofFile("java", "/extra-icons/java.png", "JVM properties (e.g. Tomcat or Maven JVM configuration): jvm.properties, jvm.config")
                .eq("jvm.properties", "jvm.config"),
            ofFile("java_alt", "/extra-icons/java_alt.svg", "JVM properties (e.g. Tomcat or Maven JVM configuration): jvm.properties, jvm.config (alternative)")
                .eq("jvm.properties", "jvm.config"),
            ofFile("imgbot", "/extra-icons/imgbot.svg", "ImgBot: .imgbotconfig")
                .eq(".imgbotconfig"),
            ofFile("jenkins", "/extra-icons/jenkins.png", "Jenkins: jenkinsfile(.xml,.yml,...), jenkins")
                .eq("jenkinsfile", "jenkins").mayEnd(CFG),
            ofFile("jenkins1", "/extra-icons/jenkins.png", "Jenkins: start by 'jenkins and end by '.xml,.yml,...'")
                .start("jenkins").end(CFG),
            ofFile("jenkins2", "/extra-icons/jenkins.png", "Jenkins: start by 'jenkins' and contain no dot")
                .start("jenkins").noDot(),
            ofFile("jest_js", "/extra-icons/jest.svg", "Jest: jest.config.js")
                .eq("jest.config.js"),
            ofFile("jest_ts", "/extra-icons/jest.svg", "Jest: jest.config.ts")
                .eq("jest.config.ts"),
            ofFile("jsbeautify", "/extra-icons/jsbeautify.png", "JSBeautify: .jsbeautifyrc(.xml,.yml,...)")
                .eq(".jsbeautifyrc").mayEnd(CFG),
            ofFile("jshint", "/extra-icons/jshint.png", "JSHint: .jshintrc(.xml,.yml,...)")
                .eq(".jshintrc").mayEnd(CFG),
            ofFile("junit", "/extra-icons/junit5.png", "JUnit: junit-platform.properties")
                .eq("junit-platform.properties"),
            ofFile("karma_js", "/extra-icons/karma.svg", "Karma: karma.conf.js")
                .eq("karma.conf.js"),
            ofFile("karate", "/extra-icons/karate.svg", "Karate: karate-config.js")
                .eq("karate-config.js"),
            ofFile("karma_ts", "/extra-icons/karma.svg", "Karma: karma.conf.ts")
                .eq("karma.conf.ts"),
            ofFile("kibana", "/extra-icons/kibana.png", "Kibana: kibana(.xml,.yml,...)")
                .eq("kibana").mayEnd(YML),
            ofFile("kibana1", "/extra-icons/kibana.png", "Kibana: start by 'kibana' and end by '.xml,.yml,...'")
                .start("kibana").end(YML),
            ofFile("knownissues", "/extra-icons/bug.svg", "Known issues: known_issues(.md,.txt,.adoc,.rst)")
                .start("known_issues").mayEnd(TXT),
            ofFile("kubernetes", "/extra-icons/kubernetes.svg", "Kubernetes: kubernetes(.xml,.yml,...)")
                .eq("kubernetes").mayEnd(YML),
            ofFile("kubernetes1", "/extra-icons/kubernetes.svg", "Kubernetes: start by 'kubernetes' and end by '.xml,.yml,...'")
                .start("kubernetes").end(YML),
            ofFile("lgtm", "/extra-icons/lgtm.svg", "LGTM: .lgtm.yml, lgtm.yml")
                .eq("lgtm", ".lgtm").end(YML),
            ofFile("lgtm_alt", "/extra-icons/lgtm_alt.svg", "LGTM: .lgtm.yml, lgtm.yml (alternative)")
                .eq("lgtm", ".lgtm").end(YML),
            ofFile("license", "/extra-icons/license.svg", "License: license(.md,.txt,.adoc,.rst), copying, license_info, additional_license_info")
                .eq("license", "copying", "license_info", "additional_license_info").mayEnd(TXT),
            ofFile("license_alt", "/extra-icons/license_alt.png", "License: license(.md,.txt,.adoc,.rst), copying, license_info, additional_license_info (alternative)")
                .eq("license", "copying", "license_info", "additional_license_info").mayEnd(TXT),
            ofFile("log4j", "/extra-icons/log4j.png", "Log4j: log4j(.xml,.yml,...), log4j-test")
                .eq("log4j", "log4j-test").mayEnd(CFG),
            ofFile("logback", "/extra-icons/logback.png", "Logback: logback(.xml,.yml,...)")
                .eq("logback").mayEnd(CFG),
            ofFile("logback1", "/extra-icons/logback.png", "Logback: start by 'logback-' and end by '.xml,.yml,...'")
                .start("logback-").mayEnd(CFG),
            ofFile("logstash", "/extra-icons/logstash.png", "Logstash: logstash(.cfg,.conf,.yml,.yaml)")
                .eq("logstash").mayEnd(".cfg", ".conf", ".yml", ".yaml"),
            ofFile("logstash1", "/extra-icons/logstash.png", "Logstash: start by 'logstash' and end by '.cfg,.conf,.yml,.yaml'")
                .start("logstash").end(".cfg", ".conf", ".yml", ".yaml"),
            ofFile("logstash2", "/extra-icons/logstash.png", "Logstash: start by 'logstash-' and end by '.cfg,.conf,.yml,.yaml,.txt'")
                .start("logstash-").end(".cfg", ".conf", ".yml", ".yaml", ".txt"),
            ofFile("lombok", "/extra-icons/lombok.svg", "Lombok: lombok.config")
                .eq("lombok.config"),
            ofFile("moduleinfojava", "/extra-icons/moduleinfo.svg", "Java module: module-info.java")
                .eq("module-info.java"),
            ofFile("moduleinfojava_alt", "/extra-icons/moduleinfo_alt.svg", "Java module: module-info.java (alternative)")
                .eq("module-info.java"),
            ofFile("mysql", "/extra-icons/my.png", "MySQL: my.ini")
                .eq("my.ini"),
            ofFile("netlify", "/extra-icons/netlify.svg", "Netlify: netlify.toml")
                .eq("netlify.toml"),
            ofFile("nginx", "/extra-icons/nginx.png", "Nginx: nginx(.conf)")
                .eq("nginx").mayEnd(".conf"),
            ofFile("nginx1", "/extra-icons/nginx.png", "Nginx: start by 'nginx' and end by '.conf'")
                .start("nginx").end(".conf"),
            ofFile("npmrc", "/extra-icons/npm.svg", "NPM: .npmrc")
                .eq(".npmrc"),
            ofFile("npmignore", "/extra-icons/npmignore.svg", "NPM: .npmignore")
                .eq(".npmignore"),
            ofFile("notice", "/extra-icons/notice.svg", "Notice: notice(.md,.txt,.adoc,.rst)")
                .eq("notice").mayEnd(TXT),
            ofFile("openissues", "/extra-icons/bug.svg", "Open issues: open_issues(.md,.txt,.adoc,.rst)")
                .start("open_issues").mayEnd(TXT),
            ofFile("packageinfojava", "/extra-icons/packageinfojava.svg", "Java package info: package-info.java")
                .eq("package-info.java"),
            ofFile("packagejson", "/extra-icons/npm.svg", "NPM: package.json")
                .eq("package.json"),
            ofFile("packagejsonlock", "/extra-icons/packagejsonlock.png", "NPM: package-lock.json")
                .eq("package-lock.json"),
            ofFile("prettier", "/extra-icons/prettier.svg", "Prettier: .prettierrc")
                .eq(".prettierrc"),
            ofFile("pdd", "/extra-icons/pdd.svg", "Puzzle Driven Development: .pdd")
                .eq(".pdd"),
            ofFile("pdd_yml", "/extra-icons/pdd.svg", "Puzzle Driven Development: .0pdd.yml")
                .eq(".0pdd.yml"),
            ofFile("prettierignore", "/extra-icons/prettierignore.svg", "Prettier: .prettierignore")
                .eq(".prettierignore"),
            ofFile("privacy", "/extra-icons/privacy.svg", "Privacy: privacy(.md,.txt,.adoc,.rst)")
                .eq("privacy").mayEnd(TXT),
            ofFile("prometheus", "/extra-icons/prometheus.svg", "Prometheus: prometheus(.yml,.yaml)")
                .eq("prometheus").end(YML),
            ofFile("puppet", "/extra-icons/puppet.svg", "Puppet: puppet(.conf)")
                .eq("puppet").mayEnd(".conf"),
            ofFile("puppet1", "/extra-icons/puppet.svg", "Puppet: start by 'puppet' and end by '.conf'")
                .start("puppet").end(".conf"),
            ofFile("readme", "/extra-icons/readme.png", "Readme: readme(.md,.txt,.adoc,.rst), lisezmoi")
                .eq("readme", "lisezmoi").mayEnd(TXT),
            ofFile("readme_alt", "/extra-icons/readme_alt.svg", "Readme: readme(.md,.txt,.adoc,.rst), lisezmoi (alternative)")
                .eq("readme", "lisezmoi").mayEnd(TXT),
            ofFile("redis", "/extra-icons/redis.svg", "Redis: redis(.conf)")
                .eq("redis").mayEnd(".conf"),
            ofFile("redis1", "/extra-icons/redis.svg", "Redis: start by 'redis' and end by '.conf'")
                .start("redis").end(".conf"),
            ofFile("renovate", "/extra-icons/renovate.svg", "Renovate: renovate.json, renovate.json5, .renovaterc.json, .renovaterc")
                .eq("renovate.json", "renovate.json5", ".renovaterc.json", ".renovaterc"),
            ofFile("restyled", "/extra-icons/restyled.svg", "Restyled: .restyled.yaml")
                .eq(".restyled.yaml"),
            ofFile("restyled_alt", "/extra-icons/restyled_alt.svg", "Restyled: .restyled.yaml (alternative 1)")
                .eq(".restyled.yaml"),
            ofFile("restyled_alt2", "/extra-icons/restyled_alt2.svg", "Restyled: .restyled.yaml (alternative 2)")
                .eq(".restyled.yaml"),
            ofFile("roadmap", "/extra-icons/roadmap.png", "Roadmap: roadmap(.md,.txt,.adoc,.rst)")
                .eq("roadmap").mayEnd(TXT),
            ofFile("rollup", "/extra-icons/rollup.svg", "Rollup: rollup.config.js")
                .eq("rollup.config.js"),
            ofFile("rultor", "/extra-icons/rultor.svg", "Rultor: .rultor.yml")
                .eq(".rultor.yml"),
            ofFile("scalingo", "/extra-icons/scalingo.svg", "Scalingo: scalingo.json")
                .eq("scalingo.json"),
            ofFile("security", "/extra-icons/security.svg", "Security: security(.md,.txt,.adoc,.rst)")
                .eq("security").mayEnd(TXT),
            ofFile("snapcraft", "/extra-icons/snap.svg", "Snapcraft: snapcraft.yaml")
                .eq("snapcraft.yaml"),
            ofFile("stacksmith", "/extra-icons/stacksmith.svg", "Bitnami Stacksmith: stackerfile.yml")
                .eq("stackerfile.yml"),
            ofFile("svgo", "/extra-icons/svgo.svg", "SVGO: svgo(.yml,.yaml)")
                .eq("svgo").end(YML),
            ofFile("swaggerconfig", "/extra-icons/swagger.svg", "Swagger: swagger-config.yaml")
                .eq("swagger-config.yaml"),
            ofFile("swaggerconfig_alt", "/extra-icons/swagger_alt.svg", "Swagger: swagger-config.yaml (alternative)")
                .eq("swagger-config.yaml"),
            ofFile("swaggerignore", "/extra-icons/swaggerignore.svg", "Swagger: .swagger-codegen-ignore")
                .eq(".swagger-codegen-ignore"),
            ofFile("tinylogproperties", "/extra-icons/tinylog_properties.svg", "Tinylog: tinylog.properties")
                .eq("tinylog.properties"),
            ofFile("testing", "/extra-icons/testing.svg", "Test: test(.md,.txt,.adoc,.rst), testing")
                .eq("test", "testing").mayEnd(TXT),
            ofFile("todo", "/extra-icons/todo.png", "To-Do: todo(.md,.txt,.adoc,.rst)")
                .eq("todo").mayEnd(TXT),
            ofFile("tox", "/extra-icons/tox.png", "Tox: tox.ini")
                .eq("tox.ini"),
            ofFile("travis", "/extra-icons/travis.svg", "Travis CI: .travis.yml")
                .eq(".travis.yml"),
            ofFile("travis_alt", "/extra-icons/travis_alt.svg", "Travis CI: .travis.yml (alternative 01)")
                .eq(".travis.yml"),
            ofFile("travis_alt02", "/extra-icons/travis_alt02.svg", "Travis CI: .travis.yml (alternative 02)")
                .eq(".travis.yml"),
            ofFile("travis_alt03", "/extra-icons/travis_alt03.svg", "Travis CI: .travis.yml (alternative 03)")
                .eq(".travis.yml"),
            ofFile("travis_alt04", "/extra-icons/travis_alt04.svg", "Travis CI: .travis.yml (alternative 04)")
                .eq(".travis.yml"),
            ofFile("travis_alt05", "/extra-icons/travis_alt05.svg", "Travis CI: .travis.yml (alternative 05)")
                .eq(".travis.yml"),
            ofFile("travis_alt06", "/extra-icons/travis_alt06.svg", "Travis CI: .travis.yml (alternative 06)")
                .eq(".travis.yml"),
            ofFile("travis_alt07", "/extra-icons/travis_alt07.svg", "Travis CI: .travis.yml (alternative 07)")
                .eq(".travis.yml"),
            ofFile("travis_alt08", "/extra-icons/travis_alt08.svg", "Travis CI: .travis.yml (alternative 08)")
                .eq(".travis.yml"),
            ofFile("travis_alt09", "/extra-icons/travis_alt09.svg", "Travis CI: .travis.yml (alternative 09)")
                .eq(".travis.yml"),
            ofFile("travis_alt10", "/extra-icons/travis_alt10.svg", "Travis CI: .travis.yml (alternative 10)")
                .eq(".travis.yml"),
            ofFile("travis_alt11", "/extra-icons/travis_alt11.svg", "Travis CI: .travis.yml (alternative 11)")
                .eq(".travis.yml"),
            ofFile("travis_alt12", "/extra-icons/travis_alt12.svg", "Travis CI: .travis.yml (alternative 12)")
                .eq(".travis.yml"),
            ofFile("travis_alt13", "/extra-icons/travis_alt13.svg", "Travis CI: .travis.yml (alternative 13)")
                .eq(".travis.yml"),
            ofFile("travis_alt14", "/extra-icons/travis_alt14.svg", "Travis CI: .travis.yml (alternative 14)")
                .eq(".travis.yml"),
            ofFile("vagrant", "/extra-icons/vagrant.svg", "Vagrant: vagrantfile")
                .eq("vagrantfile"),
            ofFile("version", "/extra-icons/version.png", "Version: (.)version(s)(.md,.txt,.adoc,.rst)")
                .eq("version", ".version", "versions", ".versions").mayEnd(TXT),
            ofFile("version_json", "/extra-icons/version.png", "Version: (.)version(s).json")
                .eq("version", ".version", "versions", ".versions").end(".json"),
            ofFile("version_properties", "/extra-icons/version.png", "Version: (.)version(s).properties")
                .eq("version", ".version", "versions", ".versions").end(".properties"),
            ofFile("version_yml", "/extra-icons/version.png", "Version: (.)version(s).y(a)ml")
                .eq("version", ".version", "versions", ".versions").end(YML),
            ofFile("version_xml", "/extra-icons/version.png", "Version: (.)version(s).xml")
                .eq("version", ".version", "versions", ".versions").end(".xml"),
            ofFile("weblate", "/extra-icons/weblate.svg", "Weblate: .weblate")
                .eq(".weblate"),
            ofFile("webpack", "/extra-icons/webpack.svg", "Webpack: webpack.conf.js")
                .eq("webpack.config.js"),
            ofFile("zalando", "/extra-icons/zalando.png", "Zalando Zappr: .zappr.yaml")
                .eq(".zappr.yaml"),

            //
            // extension only
            //
            ofFile("ext_archive", "/extra-icons/archive.svg", "Archive: *.zip, *.7z, *.tar, *.gz, *.bz2, *.xz")
                .end(".zip", ".7z", ".tar", ".gz", ".bz2", ".xz"),
            ofFile("ext_adoc", "/extra-icons/asciidoc.svg", "Asciidoc: *.adoc, *.asciidoc")
                .end(".adoc", ".asciidoc"),
            ofFile("ext_adoc_alt", "/extra-icons/asciidoc_alt.png", "Asciidoc: *.adoc, *.asciidoc (alternative)")
                .end(".adoc", ".asciidoc"),
            ofFile("ext_apk", "/extra-icons/apk.svg", "Android application package (APK): *.apk, *.xapk")
                .end(".apk", ".xapk"),
            ofFile("ext_avro_avsc", "/extra-icons/avro.svg", "Avro: *.avsc")
                .end(".avsc"),
            ofFile("ext_bin", "/extra-icons/binary.svg", "Binary: *.bin")
                .end(".bin"),
            ofFile("ext_bin_alt", "/extra-icons/binary_alt.svg", "Binary: *.bin (alternative)")
                .end(".bin"),
            ofFile("ext_back", "/extra-icons/backup.png", "Backup: *.versionbackup, *.versionsbackup, *.bak, *.back, *.backup, *.old, *.prev, *.revert")
                .end(".versionbackup", ".versionsbackup", ".bak", ".back", ".backup", ".old", ".prev", ".revert"),
            ofFile("ext_sh", "/extra-icons/bash.svg", "Bash: *.sh")
                .end(".sh"),
            ofFile("ext_cert", "/extra-icons/certificate.svg", "Certificate: *.jks, *.pem, *.crt, *.cert, *.ca-bundle, *.cer, ...")
                .end(".jks", ".pem", ".crt", ".cert", ".ca-bundle", ".cer", ".jceks", ".p12", ".p7b", ".p7s", ".pfx", ".pubkey"),
            ofFile("ext_cert_alt", "/extra-icons/certificate_alt.png", "Certificate: *.jks, *.pem, *.crt, *.cert, *.ca-bundle, *.cer, ... (alternative)")
                .end(".jks", ".pem", ".crt", ".cert", ".ca-bundle", ".cer", ".jceks", ".p12", ".p7b", ".p7s", ".pfx", ".pubkey"),
            ofFile("ext_cmd", "/extra-icons/cmd.svg", "Windows script: *.cmd, *.bat, *.ps1")
                .end(".cmd", ".bat", ".ps1"),
            ofFile("ext_csv", "/extra-icons/csv.png", "CSV: *.csv")
                .end(".csv"),
            ofFile("ext_dar", "/extra-icons/jar.png", "Diffusion Archive / XL Deploy Archive: *.dar")
                .end(".dar"),
            ofFile("ext_deb", "/extra-icons/deb.png", "Debian package: *.deb")
                .end(".deb"),
            ofFile("ext_drawio", "/extra-icons/drawio.png", "Draw.io: *.drawio, *.dio")
                .end(".drawio", ".dio"),
            ofFile("ext_epub", "/extra-icons/epub.svg", "Epub: *.epub, *.mobi, *.azw, *.azw3")
                .end(".epub", ".mobi", ".azw", ".azw3"),
            ofFile("ext_exe", "/extra-icons/msexe.png", "MS Winows: *.exe")
                .end(".exe"),
            ofFile("ext_form", "/extra-icons/form.svg", "Form (e.g. IntelliJ Swing xml form): *.form")
                .end(".form"),
            ofFile("ext_graphqls", "/extra-icons/graphql.png", "GraphQL: *.graphqls")
                .end(".graphqls"),
            ofFile("ext_haxe", "/extra-icons/haxe.png", "Haxe: *.hx")
                .end(".hx"),
            ofFile("ext_haxexml", "/extra-icons/haxehxml.png", "Haxe: *.hxml")
                .end(".hxml"),
            ofFile("ext_http", "/extra-icons/http.png", "HTTP (e.g. IntelliJ HTTP Client queries file): *.http")
                .end(".http"),
            ofFile("ext_iml", "/extra-icons/jetbrains.svg", "IntelliJ project: *.iml")
                .end(".iml"),
            ofFile("ext_jinja", "/extra-icons/jinja.svg", "Jinja: *.jinja, *.jinja2")
                .end(".jinja", ".jinja2"),
            ofFile("ext_cfg_ini", "/extra-icons/config.svg", "Configuration: *.ini")
                .end(".ini"),
            ofFile("ext_cfg_cfg", "/extra-icons/config.svg", "Configuration: *.cfg")
                .end(".cfg"),
            ofFile("ext_cfg_conf", "/extra-icons/config.svg", "Configuration: *.conf")
                .end(".conf"),
            ofFile("ext_cfg_config", "/extra-icons/config.svg", "Configuration: *.config")
                .end(".config"),
            ofFile("ext_jar", "/extra-icons/jar.png", "Java archive: *.jar")
                .end(".jar"),
            ofFile("ext_jaroriginal", "/extra-icons/jar.png", "Java archive (copy): *.jar.original")
                .end(".jar.original"),
            ofFile("ext_kdbx", "/extra-icons/keepass.png", "KeePass: *.kdbx")
                .end(".kdbx"),
            ofFile("ext_md", "/extra-icons/markdown.svg", "Markdown: *.md")
                .end(".md"),
            ofFile("ext_md_alt", "/extra-icons/markdown_alt.svg", "Markdown: *.md (alternative 1)")
                .end(".md"),
            ofFile("ext_md_alt2", "/extra-icons/markdown_alt2.svg", "Markdown: *.md (alternative 2)")
                .end(".md"),
            ofFile("ext_mwb", "/extra-icons/mysqlworkbench.png", "MySQL Workbench: *.mwb")
                .end(".mwb"),
            ofFile("ext_nsi", "/extra-icons/nsis.svg", "NSIS Nullsoft Scriptable Install System: *.nsi")
                .end(".nsi"),
            ofFile("ext_pdf", "/extra-icons/pdf.png", "PDF: *.pdf")
                .end(".pdf"),
            ofFile("ext_pdf_alt", "/extra-icons/pdf_alt.svg", "PDF: *.pdf  (alternative 1)")
                .end(".pdf"),
            ofFile("ext_pdf_alt2", "/extra-icons/pdf_alt2.svg", "PDF: *.pdf  (alternative 2)")
                .end(".pdf"),
            ofFile("ext_pid", "/extra-icons/pid.svg", "PID: *.pid")
                .end(".pid"),
            ofFile("ext_postmanconfig", "/extra-icons/postman.svg", "Postman config: *.postman.json, *postman_collection.json, *postman_environment.json")
                .end(".postman.json", "postman_collection.json", "postman_environment.json"),
            ofFile("ext_rpm", "/extra-icons/rpm.svg", "Red Hat package: *.rpm")
                .end(".rpm"),
            ofFile("ext_robotframework", "/extra-icons/robotframework.svg", "Robot Framework: *.robot")
                .end(".robot"),
            ofFile("ext_robotframework_alt", "/extra-icons/robotframework_alt.svg", "Robot Framework: *.robot (alternative)")
                .end(".robot"),
            ofFile("sass", "/extra-icons/sass.svg", "SASS: *.sass")
                .end(".sass"),
            ofFile("scss", "/extra-icons/scss.svg", "SASS: *.scss")
                .end(".scss"),
            ofFile("less", "/extra-icons/less.svg", "LESS CSS: *.less")
                .end(".less"),
            ofFile("ext_svg", "/extra-icons/svg.svg", "SVG: *.svg")
                .end(".svg"),
            ofFile("ext_tf", "/extra-icons/terraform.svg", "Terraform: *.hcl, *.tf, *.tf.json")
                .end(".hcl", ".tf", ".tf.json"),
            ofFile("ext_toml", "/extra-icons/toml.svg", "TOML: *.toml")
                .end(".toml"),
            ofFile("typescript", "/extra-icons/test-ts.svg", "Typescript: *.spec.ts")
                .end(".spec.ts"),
            ofFile("typescript-ts", "/extra-icons/typescript.svg", "Typescript: *.ts")
                .end(".ts"),
            ofFile("ext_video", "/extra-icons/video.svg", "Video: *.3gp, *.avi, *.flv, *.mkv, *.mp4, *.mpeg, *.ogm, *.webm, ...")
                .end(".3g2", ".3gp", ".avi", ".divx", ".f4a", ".f4b", ".f4p", ".f4v", ".flv", ".m4p",
                    ".m4v", ".mkv", ".mp4", ".mpg", ".mpeg", ".mov", ".ogm", ".ogv", ".vob", ".webm", ".wmv", ".xvid"),
            ofFile("ext_video_alt", "/extra-icons/video_alt.svg", "Video: *.3gp, *.avi, *.flv, *.mkv, *.mp4, *.mpeg, *.ogm, *.webm, ... (alternative 1)")
                .end(".3g2", ".3gp", ".avi", ".divx", ".f4a", ".f4b", ".f4p", ".f4v", ".flv", ".m4p",
                    ".m4v", ".mkv", ".mp4", ".mpg", ".mpeg", ".mov", ".ogm", ".ogv", ".vob", ".webm", ".wmv", ".xvid"),
            ofFile("ext_video_alt2", "/extra-icons/video_alt2.svg", "Video: *.3gp, *.avi, *.flv, *.mkv, *.mp4, *.mpeg, *.ogm, *.webm, ... (alternative 2)")
                .end(".3g2", ".3gp", ".avi", ".divx", ".f4a", ".f4b", ".f4p", ".f4v", ".flv", ".m4p",
                    ".m4v", ".mkv", ".mp4", ".mpg", ".mpeg", ".mov", ".ogm", ".ogv", ".vob", ".webm", ".wmv", ".xvid"),
            ofFile("ext_video_alt3", "/extra-icons/video_alt3.svg", "Video: *.3gp, *.avi, *.flv, *.mkv, *.mp4, *.mpeg, *.ogm, *.webm, ... (alternative 3)")
                .end(".3g2", ".3gp", ".avi", ".divx", ".f4a", ".f4b", ".f4p", ".f4v", ".flv", ".m4p",
                    ".m4v", ".mkv", ".mp4", ".mpg", ".mpeg", ".mov", ".ogm", ".ogv", ".vob", ".webm", ".wmv", ".xvid"),
            ofFile("ext_velocity", "/extra-icons/velocity.svg", "Velocity: *.vtl")
                .end(".vtl"),
            ofFile("ext_war", "/extra-icons/war.svg", "Java WAR: *.war")
                .end(".war"),
            ofFile("ext_libreoffice_calc", "/extra-icons/officedocs/localc.png", "LibreOffice Calc: *.ods")
                .end(".ods"),
            ofFile("ext_libreoffice_draw", "/extra-icons/officedocs/lodraw.png", "LibreOffice Draw: *.odg")
                .end(".odg"),
            ofFile("ext_libreoffice_impress", "/extra-icons/officedocs/loimpress.png", "LibreOffice Impress: *.odp")
                .end(".odp"),
            ofFile("ext_libreoffice_math", "/extra-icons/officedocs/lomath.png", "LibreOffice Math: *.odf")
                .end(".odf"),
            ofFile("ext_libreoffice_writer", "/extra-icons/officedocs/lowriter.png", "LibreOffice Writer: *.odt")
                .end(".odt"),
            ofFile("ext_msoffice_excel", "/extra-icons/officedocs/msexcel.png", "MSOffice Excel: *.xls, *.xlsx")
                .end(".xls", ".xlsx"),
            ofFile("ext_msoffice_onenote", "/extra-icons/officedocs/msonenote.png", "MSOffice OneNote: *.one, *.onetoc2")
                .end(".one", ".onetoc2"),
            ofFile("ext_msoffice_powerpoint", "/extra-icons/officedocs/mspowerpoint.png", "MSOffice Powerpoint: *.ppt, *.pptx")
                .end(".ppt", ".pptx"),
            ofFile("ext_msoffice_project", "/extra-icons/officedocs/msproject.png", "MSOffice Project: *.mpd, *.mpp, *.mpt")
                .end(".mpd", ".mpp", ".mpt"),
            ofFile("ext_msoffice_visio", "/extra-icons/officedocs/msvisio.png", "MSOffice Visio: *.vsd, *.vsdx, *.vss, *.vssx, *.vst, *.vstx")
                .end(".vsd", ".vsdx", ".vss", ".vssx", ".vst", ".vstx"),
            ofFile("ext_msoffice_word", "/extra-icons/officedocs/msword.png", "MSOffice Word: *.doc, *.docx")
                .end(".doc", ".docx"),
            ofFile("react", "/extra-icons/react.svg", "React: *.jsx, *.tsx")
                .end(".jsx", ".tsx")
            ofFile("babel", "/extra-icons/babel.svg", "Babel Configuration: start by 'babel', end by '.json'")
                .start("babel").end(".json")
            ofFile("babel", "/extra-icons/babel.svg", "Babel Configuration: start by '.babelrc'")
                .start(".babelrc")

            //
            // generic
            //
            ofFile("docker_generic", "/extra-icons/docker.png", "Docker (generic): start by 'dockerfile'")
                .start("dockerfile"),
            ofFile("docker_generic_alt", "/extra-icons/docker_alt.png", "Docker (generic): start by 'dockerfile' (alternative 1)")
                .start("dockerfile"),
            ofFile("docker_generic_alt2", "/extra-icons/docker_alt2.svg", "Docker (generic): start by 'dockerfile' (alternative 2)")
                .start("dockerfile"),

            //
            // programmable
            //
            ofDir("gitsubmodule", "/extra-icons/git_submodule.svg", "Git sub-module containing folder")
                .iconEnabler(IconEnablerType.GIT_SUBMODULE_FOLDER),
            ofDir("gitsubmodule_alt", "/extra-icons/git_submodule_alt.svg", "Git sub-module containing folder (alternative)")
                .iconEnabler(IconEnablerType.GIT_SUBMODULE_FOLDER)
        );
    }

    public ExtraIconProvider() {
        super();
    }

    @Override
    protected List<Model> getAllModels() {
        return allModels();
    }
}
