package com.fergalgribben.jenkinsxml2jobdsl.xml.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Buildable;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.SCMRepositoryBrowser;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.cvs.CVSRepositories;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git.Branches;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git.GitExtensions;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.git.UserRemoteConfigs;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.svn.SVNLocations;
import com.fergalgribben.jenkinsxml2jobdsl.xml.model.scm.svn.SVNWorkspaceUpdater;

@XmlRootElement(name="scm") 
public class SCM implements Buildable{
	
//	public static List<Unsupported> gitUnsupportedExtensions = new ArrayList<Unsupported>();
	
	@XmlAttribute(name="class")
	public String clazz;
	
	@XmlAttribute
	public String plugin;

	
	
	// Begin CVS
	public boolean flatten;
	public CVSRepositories repositories;
	public boolean canUseUpdate;
	public boolean skipChangeLog;
	public boolean pruneEmptyDirectories;
	public boolean disableCvsQuiet;
	public boolean cleanOnFailedUpdate;
	public boolean forceCleanCopy;
	// End CVS

	
	
	// Begin CVS ProjectSet
	public String username;
	public String password;
	// End CVS ProjectSet
	
	
	
	// Begin Git
	public String configVersion;
	public UserRemoteConfigs userRemoteConfigs;
	public Branches branches;
	public boolean doGenerateSubmoduleConfigurations;
	public GitExtensions extensions;
	// End Git
	
	
	// Begin Mercurial
	public String source;
	public String modules;
	public String revisionType;
	public String revision;
	public String subDir;
	public boolean clean;
	public SCMRepositoryBrowser browser;
	public String credentialsId;
	public boolean disableChangeLog;
	// End Mercurial
	
	// Begin Subversion
	public SVNLocations locations;
//	public MercurialOrSVNRepositoryBrowser browser; // already defined as part of mercurial. overlap!
	public String excludedRegions;
	public String includedRegions;
	public String excludedUsers;
	public String excludedRevprop;
	public String excludedCommitMessages;
	public SVNWorkspaceUpdater workspaceUpdater;
	public boolean ignoreDirPropChanges;
	public boolean filterChangelog;
	// End Subversion
	
	

	@Override
	public void build(com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder builder) {

		builder.create("scm").openClosure();
		
		if (clazz.contains("Git")){
			git(builder);
		}
		
		builder.closeClosure();
		
	}
	
	public void git(com.fergalgribben.jenkinsxml2jobdsl.jobdsl.Builder builder) {

		builder.create("git").openClosure();
		
		branches.build(builder);
		
		userRemoteConfigs.build(builder);
		
		extensions.build(builder);
		
		builder.closeClosure();
		
	}
}
