package org.apache.tez.dag.app;

import org.apache.hadoop.yarn.api.records.ContainerId;
import org.apache.hadoop.yarn.api.records.NodeId;
import org.apache.hadoop.yarn.api.records.Priority;
import org.apache.hadoop.yarn.api.records.Resource;
import org.apache.tez.serviceplugins.api.TaskAttemptEndReason;
import org.apache.tez.serviceplugins.api.TaskScheduler;
import org.apache.tez.serviceplugins.api.TaskSchedulerContext;

import javax.annotation.Nullable;

/**
 * Created by jth on 10/27/15.
 */
public class JthTaskScheduler extends TaskScheduler {
    public JthTaskScheduler(TaskSchedulerContext taskSchedulerContext) {
        super(taskSchedulerContext);
    }

    @Override
    public Resource getAvailableResources() {
        return null;
    }

    @Override
    public Resource getTotalResources() {
        return null;
    }

    @Override
    public int getClusterNodeCount() {
        return 0;
    }

    @Override
    public void blacklistNode(NodeId nodeId) {

    }

    @Override
    public void unblacklistNode(NodeId nodeId) {

    }

    @Override
    public void allocateTask(Object task, Resource capability, String[] hosts, String[] racks, Priority priority, Object containerSignature, Object clientCookie) {
    }

    @Override
    public void allocateTask(Object task, Resource capability, ContainerId containerId, Priority priority, Object containerSignature, Object clientCookie) {

    }

    @Override
    public boolean deallocateTask(Object task, boolean taskSucceeded, TaskAttemptEndReason endReason, @Nullable String diagnostics) {
        return false;
    }

    @Override
    public Object deallocateContainer(ContainerId containerId) {
        return null;
    }

    @Override
    public void setShouldUnregister() {

    }

    @Override
    public boolean hasUnregistered() {
        return false;
    }

    @Override
    public void dagComplete() {

    }
}
