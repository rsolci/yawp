package io.yawp.plugin.scaffolding.mojo;

import io.yawp.plugin.scaffolding.ShieldScaffolder;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "shield")
public class ShieldMojo extends ScaffolderAbstractMojo {

    @Override
    public void run() throws MojoExecutionException {
        ShieldScaffolder scaffolder = new ShieldScaffolder(getLog(), yawpPackage, model);
        scaffolder.createTo(baseDir);
    }

}